package design.patterns;

public class President {
    static President president;
    President(){}

    public static President getInstance(){
        return president;
    }
}
