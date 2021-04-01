package SortingClasses;

import java.util.Comparator;
import Classes.*;

public class Sortid implements Comparator<Cont> {
        @Override
        public int compare(Cont contact, Cont contact2) {
        return new Integer(contact.getId()).compareTo(new Integer(contact2.getId()));
    }
}
