package Socket;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author moci
 * @create 2018-03-27 19:37
 **/
public class TestJPG {
    @Test
    public void client() throws Exception{
        Socket sc = new Socket(InetAddress.getByName("localhost"),8899);
        OutputStream os = sc.getOutputStream();
        FileInputStream fis = new FileInputStream(new File("1.jpg"));
        byte[] b= new byte[1024];
        int len;
        while ((len = fis.read(b))!= -1){
            os.write(b,0,len);
        }
        sc.shutdownOutput();
        //3
        InputStream is = sc.getInputStream();
        int len2;
        byte[] b1 = new byte[1024];
        while ((len2 = is.read(b1))!= -1){
            String str = new String(b1,0,len2);
            System.out.println(str);
        }
        is.close();
        os.close();
        fis.close();
        sc.close();

    }

    @Test
    public void server() throws Exception{
        ServerSocket ss = new ServerSocket(8899);
        Socket sc = ss.accept();
        InputStream is = sc.getInputStream();
        FileOutputStream fos = new FileOutputStream(new File("3.jpg"));
        byte[] b = new  byte[1024];
        int len;
        while ((len = is.read(b))!= -1){
            fos.write(b,0,len);
        }

        OutputStream os = sc.getOutputStream();
        os.write("还行".getBytes());
        os.close();
        is.close();
        sc.close();
        fos.close();
        ss.close();
    }
}
