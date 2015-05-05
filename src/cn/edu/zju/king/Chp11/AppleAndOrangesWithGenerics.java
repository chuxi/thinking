package cn.edu.zju.king.Chp11;

import java.util.ArrayList;

/**
 * Created by king on 2015/3/28.
 */
public class AppleAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();

        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

//        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }

        for (Apple c: apples) {
            System.out.println(c.id());
        }
    }
}
