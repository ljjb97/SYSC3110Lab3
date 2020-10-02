public class BuddyInfo {



    private String name;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public static void main(String[] args) {
        BuddyInfo x = new BuddyInfo("Liam", "carleton", "613");
        System.out.println("Hello, " + x.getName());
    }
}

/*
 1. External Libraries
    Scratches and Consoles
    <project name>
        .idea
        src
        <project name>.iml

 2. Java.base
    Java.compiler
    java.desktop

 */
