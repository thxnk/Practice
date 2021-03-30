import java.util.Comparator;

public class SortLastName implements Comparator<CollContact> {
    @Override
    public int compare(CollContact contact, CollContact contact2) {
        return contact.getLastName().compareTo(contact2.getLastName());
    }
}