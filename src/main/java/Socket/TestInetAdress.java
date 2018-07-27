package Socket;

import javafx.scene.media.SubtitleTrack;

import java.net.InetAddress;

/**
 * @author moci
 * @create 2018-03-27 14:53
 **/
public class TestInetAdress   {
    public static void main(String[] args) throws Exception {
        String a = "";
        InetAddress inetAddress = InetAddress.getByName("activate.adobe.com");
        System.out.println(inetAddress.getHostName()+"  "+inetAddress.getHostAddress());
    }

}
