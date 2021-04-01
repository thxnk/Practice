package SortingClasses;
import Classes.*;

import java.util.Comparator;

public class SortLast implements Comparator<Presid> {
    @Override
    public int compare(Presid pres, Presid pres2) {
        return pres.getLastName().compareTo(pres2.getLastName());
    }
}
