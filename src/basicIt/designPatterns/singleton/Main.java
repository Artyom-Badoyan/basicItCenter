package basicIt.designPatterns.singleton;

public class Main {
    public static void main(String[] args) {

        MySingleton mySingleton = MySingleton.getInstance();
        MySingleton mySingleton1 = MySingleton.getInstance();
        MySingleton mySingleton2 = MySingleton.getInstance();
        System.out.println(mySingleton == mySingleton1);
        System.out.println(mySingleton == mySingleton1);
        System.out.println(mySingleton1.equals(mySingleton2));
        System.out.println(mySingleton1);

    }
}
