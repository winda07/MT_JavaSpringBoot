import java.util.logging.Logger;
import java.util.logging.Level;

public class ThreadHello implements Runnable {
    private final String name;

    public ThreadHello(String name){
        this.name=name;
    }

    // @Override
    public void run(){
        System.out.println(name + ": Hello");
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex ) {
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
            //TODO: handle exception
        }
    }

    // @Test
    public static void testRun(){
        for(int i=0; i<5; i++){
            ThreadHello instance = new ThreadHello(String.valueOf(i));
            Thread t = new Thread(instance);
            t.start();
        }
    }

    public static void main(String[] args) {
        testRun();
    }
}
