package SerSortingClasses;


import SerClasses.SCont;

import java.util.Comparator;

public class SSortId implements Comparator<SCont>{

        @Override
        public int compare(SCont contact, SCont contact2) {
            return new Integer(contact.getId()).compareTo(new Integer(contact2.getId()));
        }

}
