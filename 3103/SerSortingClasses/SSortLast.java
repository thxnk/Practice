package SerSortingClasses;

import SerClasses.SPresid;

import java.util.Comparator;

public class SSortLast implements Comparator<SPresid>{
        @Override
        public int compare(SPresid pres, SPresid pres2) {
            return pres.getLastName().compareTo(pres2.getLastName());
        }
}
