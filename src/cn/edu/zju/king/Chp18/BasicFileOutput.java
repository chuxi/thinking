package cn.edu.zju.king.Chp18;

import java.io.*;

/**
 * Created by king on 15-4-16.
 */
public class BasicFileOutput {
    static String file = "out/BasicFileOutput.java";
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(
                BufferedInputFile.read("src/cn/edu/zju/king/Chp18/BufferedInputFile.java")
        ));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int linecount = 1;
        String s;
        while ( (s = in.readLine())!= null) {
            out.println(linecount++ + ": " + s);
        }
        out.close();
    }
}
