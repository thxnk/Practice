import java.util.Comparator;

public class SortAdress implements Comparator<CollContact> {
    @Override
    public int compare(CollContact contact, CollContact contact2) {
        return contact.getAdress().compareTo(contact2.getAdress());
    }
}