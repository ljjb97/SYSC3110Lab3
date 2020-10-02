import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> book;//book is used to store the known buddys

    /**
     *
     * @param buddy the buddy to add
     */
    public void addBuddy(BuddyInfo buddy) {
        book.add(buddy);
    }

    /**
     *
     * @param buddy the buddy to remove
     */
    public void removeBuddy(BuddyInfo buddy) {
        book.remove(buddy);
    }
    
    //I added this comment in github
    public AddressBook() {
        this.book = new ArrayList<BuddyInfo>();
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook x = new AddressBook();
        x.addBuddy(buddy);
        x.removeBuddy(buddy);
    }
}
