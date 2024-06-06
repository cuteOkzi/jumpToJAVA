package chap07;
import java.util.ArrayList;

public class _08_Thread extends Thread {
    int seq;
    public _08_Thread(int seq) {
        this.seq = seq;
    }

    public void run(){ // Thread 상속 시 run 메소드 구현해야 함
        System.out.println(this.seq + " thread start.");
        try{
            Thread.sleep(1000); //1초 대기
        }catch(Exception e){
            System.out.println(this.seq + " thread end."); //스레드 종료
        }
    }

    public static void main(String[] args){
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            _08_Thread t = new _08_Thread(i);
            t.start();
            threads.add(t);
        }

        for (int i = 0; i < threads.size(); i++) {
            Thread t = threads.get(i);
            try{
                t.join();
            }catch(Exception e){
            }
        }

        System.out.println("main end.");
    }
}
