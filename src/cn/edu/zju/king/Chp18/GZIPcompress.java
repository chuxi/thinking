package cn.edu.zju.king.Chp18;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by king on 15-4-18.
 */
public class GZIPcompress {
    public static void main(String[] args) throws IOException {
        String infilename = "src/cn/edu/zju/king/Chp18/BufferedInputFile.java";
        BufferedReader in = new BufferedReader(new FileReader(infilename));

        BufferedOutputStream out = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("out/gtest.gz")));
        System.out.println("writing file");
        int c;
        while ((c=in.read())!= -1)
            out.write(c);
        in.close();
        out.close();

        System.out.println("Reading File");
        BufferedReader in2 = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("out/gtest.gz"))));
        String s;
        while ((s=in2.readLine())!= null)
            System.out.println(s);
    }
}
