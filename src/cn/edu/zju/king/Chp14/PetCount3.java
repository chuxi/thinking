package cn.edu.zju.king.Chp14;

import cn.edu.zju.king.Chp14.pets.Pet;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by king on 15-3-31.
 */
public class PetCount3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
//            super(MapData.map(LiteralPetCreator.allTypes, 0));
        }
        public void count(Pet pet) {
            for (Map.Entry<Class<? extends Pet>, Integer> pair: entrySet())
                if (pair.getKey().isInstance(pet))
                    put(pair.getKey(), pair.getValue() + 1);
        }
    }
}
