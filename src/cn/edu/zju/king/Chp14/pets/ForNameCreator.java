package cn.edu.zju.king.Chp14.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by king on 15-3-31.
 */
public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();

    private static String[] typeNames = {
            "cn.edu.zju.king.Chp14.pets.Mutt",
            "cn.edu.zju.king.Chp14.pets.Pug",
            "cn.edu.zju.king.Chp14.pets.EgyptianMau",
            "cn.edu.zju.king.Chp14.pets.Manx",
            "cn.edu.zju.king.Chp14.pets.Cymric",
            "cn.edu.zju.king.Chp14.pets.Rat",
            "cn.edu.zju.king.Chp14.pets.Mouse",
            "cn.edu.zju.king.Chp14.pets.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try{
            for(String name: typeNames){
                types.add(
                        (Class<? extends Pet>)Class.forName(name)
                );
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static {loader();}
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
