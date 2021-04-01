package SortingClasses;

import Classes.*;
import java.util.Comparator;

public class SortName implements Comparator<Cont>{
        @Override
        public int compare(Cont contact, Cont contact2) {
            return contact.getFirstName().compareTo(contact2.getFirstName());
        }
}
