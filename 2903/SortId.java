import java.util.Comparator;

public class SortId implements Comparator<CollContact> {
    @Override
    public int compare(CollContact contact, CollContact contact2) {
        return new Integer(contact.getId()).compareTo(new Integer(contact2.getId()));
    }
}
