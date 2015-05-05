package cn.edu.zju.king.Chp14.pets;

/**
 * Created by king on 2015/3/28.
 */
public class Individual {
    private static long count;
    private final long id = count++;
    private String name;

    public long id() { return id; }


    public Individual(String name) {
        this.name = name;
    }

    public Individual() { this.name = Long.toString(id);}

    public String name() { return name; }

    public String toString() { return Long.toString(id); }
}
