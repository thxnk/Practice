package SerSortingClasses;

import Classes.Cont;
import SerClasses.SCont;

import java.util.Comparator;

public class SSortName implements Comparator<SCont>{
        @Override
        public int compare(SCont contact, SCont contact2) {
            return contact.getFirstName().compareTo(contact2.getFirstName());
        }
}
