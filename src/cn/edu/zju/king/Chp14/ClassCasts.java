package cn.edu.zju.king.Chp14;

/**
 * Created by king on 15-3-31.
 */

class Building {}
class House extends Building {}

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House)b;
    }
}
