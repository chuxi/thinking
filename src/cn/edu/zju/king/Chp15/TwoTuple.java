package cn.edu.zju.king.Chp15;

/**
 * Created by king on 2015/3/28.
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        first = a;
        second = b;
    }

    public String toString() {
        return "(" + first + ". " + second + ")";
    }
}
