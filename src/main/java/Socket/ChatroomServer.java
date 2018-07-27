package Socket;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.net.Socket;
/**
 * @author moci
 * @create 2018-03-27 13:58
 **/
@Test
public class ChatroomServer extends ServerSocket {
    private static final int SERVER_PORT = 8899; // 服务端端口
    private static final String END_MARK = "quit"; // 退出聊天室标识
    private static final String VIEW_USER = "viewuser"; // 查看在线成员列表

    private static List<String> userList = new CopyOnWriteArrayList<String>();
    private static List<Task> threadList = new ArrayList<Task>(); // 服务器已启用线程集合
    private static BlockingQueue<String> msgQueue = new ArrayBlockingQueue<String>(
            20); // 存放消息的队列

    public ChatroomServer() throws Exception {
        super(SERVER_PORT);
    }

    /**
     * 启动向客户端发送消息的线程，使用线程处理每个客户端发来的消息
     *
     * @throws Exception
     */
    public void load() throws Exception {
        new Thread(new PushMsgTask()).start(); // 开启向客户端发送消息的线程

        while (true) {
            // server尝试接收其他Socket的连接请求，server的accept方法是阻塞式的
            Socket socket = this.accept();
            /**
             * 我们的服务端处理客户端的连接请求是同步进行的， 每次接收到来自客户端的连接请求后，
             * 都要先跟当前的客户端通信完之后才能再处理下一个连接请求。 这在并发比较多的情况下会严重影响程序的性能，
             * 为此，我们可以把它改为如下这种异步处理与客户端通信的方式
             */
            // 每接收到一个Socket就建立一个新的线程来处理它
            new Thread(new Task(socket)).start();
        }
    }

    /**
     * 从消息队列中取消息，再发送给聊天室所有成员
     */
    class PushMsgTask implements Runnable {

        @Override
        public void run() {
            while (true) {
                String msg = null;
                try {
                    msg = msgQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (msg != null) {
                    for (Task thread : threadList) {
                        thread.sendMsg(msg);
                    }
                }
            }
        }

    }

    /**
     * 处理客户端发来的消息线程类
     */
    class Task implements Runnable {

        private Socket socket;

        private BufferedReader buff;

        private Writer writer;

        private String userName; // 成员名称

        /**
         * 构造函数<br>
         * 处理客户端的消息，加入到在线成员列表中
         *
         * @throws Exception
         */
        public Task(Socket socket) {
            this.socket = socket;
            this.userName = String.valueOf(socket.getPort());
            try {
                this.buff = new BufferedReader(new InputStreamReader(
                        socket.getInputStream(), "UTF-8"));
                this.writer = new OutputStreamWriter(socket.getOutputStream(),
                        "UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
            userList.add(this.userName);
            threadList.add(this);
            pushMsg("【" + this.userName + "进入了聊天室】");
            System.out.println("Form Cliect[port:" + socket.getPort() + "] "
                    + this.userName + "进入了聊天室");
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String msg = buff.readLine();

                    if (VIEW_USER.equals(msg)) { // 查看聊天室在线成员
                        sendMsg(onlineUsers());
                    } else if (END_MARK.equals(msg)) { // 遇到退出标识时就结束让客户端退出
                        sendMsg(END_MARK);
                        break;
                    } else {
                        pushMsg(String.format("%1$s说：%2$s", userName, msg));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally { // 关闭资源，聊天室移除成员
                try {
                    writer.close();
                    buff.close();
                    socket.close();
                } catch (Exception e) {

                }
                userList.remove(userName);
                threadList.remove(this);
                pushMsg("【" + userName + "退出了聊天室】");
                System.out.println("Form Cliect[port:" + socket.getPort() + "] "
                        + userName + "退出了聊天室");
            }
        }

        /**
         * 准备发送的消息存入队列
         *
         * @param msg
         */
        private void pushMsg(String msg) {
            try {
                msgQueue.put(msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /**
         * 发送消息
         *
         * @param msg
         */
        private void sendMsg(String msg) {
            try {
                writer.write(msg);
                writer.write("\015\012");
                writer.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /**
         * 聊天室在线成员列表
         *
         * @return
         */
        private String onlineUsers() {
            StringBuffer sbf = new StringBuffer();
            sbf.append("======== 在线成员列表(").append(userList.size())
                    .append(") ========\015\012");
            for (int i = 0; i < userList.size(); i++) {
                sbf.append("[" + userList.get(i) + "]\015\012");
            }
            sbf.append("===============================");
            return sbf.toString();
        }

    }

    /**
     * 入口
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            ChatroomServer server = new ChatroomServer(); // 启动服务端
            server.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
