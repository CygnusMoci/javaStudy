package javaSE;

import java.io.*;
import java.util.Scanner;

/**
 * 读文件与写文件.
 * @author moci
 * @create 2018-05-09 16:50
 **/
public class ioTest {
    static final String txtURL = "F:/文档/大事件记录表.txt";
    static final String Target = "F:/文档/副本.txt";

    public static void main(String[] args) throws IOException{

        try {
            File fileName = new File(txtURL);
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(fileName),"GBK"
            );

            BufferedReader br = new BufferedReader(reader);
            String line = "";
            line = br.readLine();
            while (line != null) {
                line = br.readLine(); // 一次读入一行数据
                System.out.println(line);
            }

            File target = new File(Target);
            target.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(target));

            out.write("我会写txt了！");
            out.flush();//压入缓存
            out.close();//关闭

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
