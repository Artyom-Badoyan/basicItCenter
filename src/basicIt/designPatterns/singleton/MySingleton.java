package basicIt.designPatterns.singleton;

public class MySingleton {

    private static final MySingleton instance = new MySingleton();

    private MySingleton(){

    }
    public static MySingleton getInstance(){
        return instance;
    }
}
