package Socket;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


/**
 * TCP实现单例
 * @author moci
 * @create 2018-03-27 15:51
 **/
public class TestTCP {
    /**
     * 客户端
     * @throws IOException
     */
    @Test
    public static void client() throws IOException{
        InetAddress ina = InetAddress.getByName("Localhost");
        System.out.println(ina.getHostName()+"  "+ina.getHostAddress());
        Socket socket = new Socket(ina,9090);

        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            os.write(str.getBytes());
            if(str.equals("exit")){
                socket.shutdownOutput();
                sc.close();
                os.close();
            }
        }
    }

    /**
     * 服务端
     * @throws IOException
     */
    @Test
    public  void server() throws IOException {
        ServerSocket ss = new ServerSocket(9090);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] b = new byte[20];
        int length;
        while ((length = is.read(b)) != -1){
            String  str = new String(b,0,length);
            System.out.println("用户【"+s.getInetAddress().getHostName()+"】"+"说:"+str);
        }
        System.out.println("用户【"+s.getInetAddress().getHostName()+"】已经退出");
        is.close();
        ss.close();
        ss.close();

    }

    public static void main(String[] args) {
        try {
            client();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("已退出");
        }
    }
}
