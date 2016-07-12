package ua.goit.gojava.module_3.flowers;

import java.util.ArrayList;
import java.util.List;

public class BunchOfFlowers {
    private List<Flower> flowers = new ArrayList<>(5);

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }
}
