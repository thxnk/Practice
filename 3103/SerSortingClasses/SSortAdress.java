package SerSortingClasses;

import SerClasses.SEmploy;

import java.util.Comparator;

public class SSortAdress implements Comparator<SEmploy>{
        @Override
        public int compare(SEmploy contact, SEmploy contact2) {
            return contact.getAdress().compareTo(contact2.getAdress());
        }
}
