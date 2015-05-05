package cn.edu.zju.king.Chp14;

/**
 * Created by king on 15-3-31.
 */
public class BoundedClassReference {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
    }
}
