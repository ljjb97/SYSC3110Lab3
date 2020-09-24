public class BuddyInfo {

    public String getName() {
        return name;
    }

    private String name;

    public String getAddress() {
        return address;
    }

    private String address;

    public BuddyInfo(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        BuddyInfo x = new BuddyInfo("Liam", "carleton");
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
