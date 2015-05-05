package cn.edu.zju.king.Chp18;

import java.io.*;

/**
 * Created by king on 15-4-18.
 */
public class Redirecting {
    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("src/cn/edu/zju/king/Chp18/BufferedInputFile.java"));
        PrintStream out = new PrintStream(
                new BufferedOutputStream(new FileOutputStream("out/test.txt"))
        );
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String s;
        while ( (s=br.readLine()) != null)
            System.out.println(s);
        out.close();
        System.setOut(console);
    }
}
