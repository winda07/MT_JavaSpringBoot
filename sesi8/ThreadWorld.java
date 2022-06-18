import java.util.logging.Logger;
import java.util.logging.Level;

public class ThreadWorld extends Thread {

    // @Override
    public void run(){
        System.out.println(getName() + ": World");
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
           ThreadWorld instance = new ThreadWorld();
           instance.setName(""+ i);
           instance.start();
        }
    }

    public static void main(String[] args) {
        testRun();
    }
}
