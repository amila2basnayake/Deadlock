public class DeadLoack {



    public static void main(String str[]){
        Object object1 = new Object();
        Object object2 = new Object();

        ThreadDemo1 demo1 = new ThreadDemo1(object1,object2);
        demo1.start();

        ThreadDemo2 demo2 = new ThreadDemo2(object1,object2);
        demo2.start();
    }


}
