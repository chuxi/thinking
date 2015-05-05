package cn.edu.zju.king.Chp18;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * Created by king on 15-4-16.
 */
public class FormattedMemoryInput {
    public static void main(String[] args) {
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("src/cn/edu/zju/king/Chp18/BufferedInputFile.java").getBytes()));
            while (in.available()!=0)
                System.out.print((char)in.readByte());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
