public class ThreadDemo2  extends Thread{

    private Object objaect1;
    private Object objaect2;

    public ThreadDemo2(Object objaect1, Object objaect2) {
        this.objaect1 = objaect1;
        this.objaect2 = objaect2;
    }

    @Override
    public void run() {
        synchronized (objaect1){
            try {
                System.out.println(" lock object 2 and wait for object 1");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (objaect2){
                System.out.println(" object 1 and 2");
            }
        }
    }
}
