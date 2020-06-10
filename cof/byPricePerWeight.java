package cof;

import java.util.Comparator;

public class byPricePerWeight implements Comparator<Coffee> {
    public int compare(Coffee a, Coffee b) {
        return Double.compare(a.getPricePerWeight(), b.getPricePerWeight());
    }
}
