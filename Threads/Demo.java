class A extends Thread{
public void run(){

    for(int i=0;i<100;i++){
        System.out.println("Hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
  
    
}
}
class B extends Thread{
public void run(){
    for(int i=0;i<100;i++){
        System.out.println("Hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
}

class Counter{
    int cnt;
    public synchronized void increment(){
        cnt++;
    }

}



public class Demo {
public static void main(String[] args) throws InterruptedException{
      /*  A obj=new A();
        B obj1=new B();
        obj.start();
         try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj1.start();
        */
      Counter ctCounter=new Counter();
      Runnable obj = () -> { // Implementing lambda as runnnable is a Functional Interface
          for (int i = 0; i < 10000; i++) {
              ctCounter.increment();
          }
      };
      Runnable obj2 = () -> {
          for (int i = 0; i < 10000; i++) {
            ctCounter.increment();

          }
      };
        Thread T=new Thread(obj);// thread takes a runnble object in constructor
        Thread T2=new Thread(obj2);
        T.start();
        T2.start();
        T.join();
        T2.join();
        System.out.println(ctCounter.cnt);
        // we will observer count less than 2000 as well because two threads 
        //might be incrementing at same time and that might happen multiple times
        //so we should be avaiding mutable things for threads and if need we should be implementing thread safe
        //using synchronised so only one thread access the method at a time

}
}
