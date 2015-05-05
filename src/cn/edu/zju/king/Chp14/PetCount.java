package cn.edu.zju.king.Chp14;

import cn.edu.zju.king.Chp14.pets.ForNameCreator;
import cn.edu.zju.king.Chp14.pets.Pet;
import cn.edu.zju.king.Chp14.pets.PetCreator;

import java.util.HashMap;

/**
 * Created by king on 15-3-31.
 */
public class PetCount {
    static class PetCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null)
                put(type, 1);
            else
                put(type, quantity+1);
        }
    }

    public static void countPets(PetCreator creator) {
        PetCounter counter = new PetCounter();
        for (Pet pet: creator.createArray(20)) {
            System.out.print(pet.getClass().getSimpleName() + " ");
            if (pet instanceof Pet)
                counter.count("Pet");

        }
        System.out.println();
        System.out.println(counter);

    }
    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}
