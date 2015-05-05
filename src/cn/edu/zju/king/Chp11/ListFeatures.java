package cn.edu.zju.king.Chp11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by king on 2015/3/28.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.remove(new Integer(3));
        System.out.println(list);
        System.out.println(new Integer(2) == 2);
    }
}
