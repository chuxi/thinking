package cn.edu.zju.king.Chp11;

import cn.edu.zju.king.Chp14.*;

import java.util.ArrayList;

/**
 * Created by king on 2015/3/28.
 */

class Apple {
    private static long count;
    private final long id = count++;
    public long id() { return id; }
}

class Orange {}

public class AppleAndOrangesWithoutGenerics {

    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());

        apples.add(new Orange());

        for (int i = 0; i < apples.size(); i++);
//            ((Apple)apples.get(i)).id();
    }

}
