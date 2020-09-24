public class BuddyInfo {

    public String getName() {
        return name;
    }

    private  String name;

    public BuddyInfo(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        BuddyInfo x = new BuddyInfo("Liam");
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
