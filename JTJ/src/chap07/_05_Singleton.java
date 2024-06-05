package chap07;

class Singleton{
    private Singleton(){
    }

    public static Singleton getInstance(){
        return new Singleton();
    }
}

public class _05_Singleton {
    public static void main(String[] args) {
        Singleton singleton = new Singleton();
    }
}
