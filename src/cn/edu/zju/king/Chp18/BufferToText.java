package cn.edu.zju.king.Chp18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * Created by king on 15-4-18.
 */
public class BufferToText {
    private static final int BSIZE = 1024;
    public static void main(String[] args) throws IOException {
        FileChannel fc = new FileOutputStream("out/data.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text ".getBytes()));
        fc.close();

        fc = new FileInputStream("out/data.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();

        System.out.println(buff.asCharBuffer());

        buff.rewind();
        String encoding = System.getProperty("file.encoding");
        System.out.println(Charset.forName(encoding).decode(buff));

        fc = new FileOutputStream("out/data.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text ".getBytes("UTF-16BE")));
        fc.close();

        fc = new FileInputStream("out/data.txt").getChannel();
        buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();

        System.out.println(buff.asCharBuffer());
    }
}
