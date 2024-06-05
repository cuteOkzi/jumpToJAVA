package chap05;

class Updater{
    void update(int count){
        count++;
    }
}

class Updater2{
    void update(Counter c){
        c.count++;
    }
}

class Counter{
    int count = 0;
}

public class _04_Call {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update: " + myCounter.count);

        Updater myUpdater = new Updater();
        myUpdater.update(myCounter.count);
        System.out.println("after update: " + myCounter.count);

        Updater2 myUpdater2 = new Updater2();
        myUpdater2.update(myCounter);
        System.out.println("after update2: " + myCounter.count);
    }
}
