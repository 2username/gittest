
public class Main {

    private final Object monitor = new Object();

    public synchronized void setWork(){
        System.out.println("send work ");
        synchronized (monitor){ // критическая секция
            try{
                monitor.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("work done");
    }

}
