import java.util.HashMap;

public class AddressBook {
    private HashMap<BuddyInfo, String> book;//book is used to store the address for each buddy

    /**
     *
     * @param buddy the buddy to add
     * @param address the buddys address
     */
    public void addBuddy(BuddyInfo buddy, String address) {
        book.put(buddy, address);
    }

    /**
     *
     * @param buddy the buddy to remove
     */
    public void removeBuddy(BuddyInfo buddy) {
        book.remove(buddy);
    }

    public AddressBook() {
        this.book = new HashMap<BuddyInfo, String>();
    }

    public static void main(String[] args) {
        AddressBook x = new AddressBook();
        System.out.println("Address Book");
    }
}
