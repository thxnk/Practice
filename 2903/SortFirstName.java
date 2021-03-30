import java.util.Comparator;

public class SortFirstName implements Comparator<CollContact> {
    @Override
    public int compare(CollContact contact, CollContact contact2) {
        return contact.getFirstName().compareTo(contact2.getFirstName());
    }
}