public class ThreadDemo1 extends Thread{
    private Object objaect1;
    private Object objaect2;

    public ThreadDemo1(Object objaect1, Object objaect2) {
        this.objaect1 = objaect1;
        this.objaect2 = objaect2;
    }

    @Override
    public void run() {
        synchronized (objaect2){

            try {
                System.out.println(" lock object 1 and wait for object 2");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (objaect1){
                System.out.println(" object 1 and 2");
            }
        }
    }
}
