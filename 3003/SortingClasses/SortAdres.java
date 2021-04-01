package SortingClasses;

import java.util.Comparator;
import Classes.*;

public class SortAdres implements Comparator<Employ>{
    @Override
    public int compare(Employ contact, Employ contact2) {
        return contact.getAdress().compareTo(contact2.getAdress());
    }
}
