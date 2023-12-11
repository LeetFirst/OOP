package Singletone;

public class Console {

    private static Console instance;
    private Console(){}
    public static Console getInstance() {
        if(instance == null) instance = new Console();
        return instance;
    }

}
