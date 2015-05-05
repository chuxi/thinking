package cn.edu.zju.king.Chp15;

/**
 * Created by king on 15-4-2.
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id() {return id;}
    public String toString() {
        return "CountedObject " + id;
    }
}
