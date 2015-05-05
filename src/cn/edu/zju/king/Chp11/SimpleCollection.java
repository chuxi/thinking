package cn.edu.zju.king.Chp11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by king on 2015/3/28.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer i: c) {
            System.out.println(i + ", ");
        }
    }
}
