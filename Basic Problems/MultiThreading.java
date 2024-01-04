


////////////////////////////////////////////////////////////////
//Synchronized static(Class level)
// class colony{
//     static int doorno =10;
//      synchronized static  void myMethod(int userdoorno){
//         if(userdoorno==doorno){
//             System.out.println("He can enter");
//         }else{
//             System.out.println("He can't enter");
//         }
//     }
// }

// class Mythread1 extends Thread{
//     colony c;
//     int userdoorno;
//     Mythread1(colony c,int userdoorno){
//         this.c = c;
//         this.userdoorno = userdoorno;
//     }
//     public void run(){
//         c.myMethod(userdoorno);
//     }
// }

// class Mythread2 extends Thread{
//     colony c;
//     int userdoorno;
//     Mythread2(colony c,int userdoorno){
//         this.c = c;
//         this.userdoorno = userdoorno;
//     }
//     public void run(){
//         c.myMethod(userdoorno);
//     }
// }

// public class MultiThreading{
//     public static void main(String[] args) {
//     colony obj = new colony();
//     Mythread1 t1 = new Mythread1(obj,11);
//     t1.start();
//     Mythread2 t2 = new Mythread2(obj,10);
//     t2.start();

//     colony obj1 = new colony();
//     Mythread1 t3 = new Mythread1(obj1,20);
//     t3.start();
//     Mythread2 t4 = new Mythread2(obj1,122);
//     t4.start();
//     }
// }
///////////////////////////////////////////////////////////////



///////////////////////////////////////////////////////////////
//Synchronized block
// public class MultiThreading extends Thread{
//      void myMethod(int a,int b){
//         //Synchronized block
//         synchronized(this){
//             if(a>b){
//                 System.out.println("This is true");
//             }else{
//                 System.out.println("This is false");
//             }
//         }
//     }
//     public void run(){
//             System.out.println(Thread.currentThread().getName());
//         }
//     public static void main(String[] args) {
//         MultiThreading a = new  MultiThreading();
//         a.myMethod(7,6);
//         a.start();
//         a.setName("This is A thread");
//         MultiThreading b = new MultiThreading();
//         b.myMethod(4,5);
//         b.start();
//         b.setName("This is B thread");
//     }
// }
/////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////
//Synchronized method
// public class MultiThreading extends Thread{
//     
//     synchronized void myMethod(int seats){
//         System.out.println("This is Syncronized method");
//     }
//     public  void run(){
//         System.out.println("This is the thread");;
//     }
//     public static void main(String[] args) {
//         MultiThreading a = new  MultiThreading();
//         a.myMethod(5);
//         a.start();
//         MultiThreading b = new MultiThreading();
//         b.myMethod(4);
//         b.start();
//     }
// }
/////////////////////////////////////////////////////////////











/////////////////////////////////////////////////////////////////////////////////////////
// Using Yield,join,Deamon,Priority,isalive,isInterrupted,Naming,Sleep
// public class MultiThreading extends Thread{
//     //public static Thread  mainMethod;
//     public void run(){
//         System.out.println(Thread.interrupted());
//         System.out.println(Thread.currentThread().isInterrupted());//calling twice will give status as false
//         try {
//             //mainMethod.join();
//             Thread.sleep(1000);
//             System.out.println(Thread.currentThread().getName());
//             System.out.println(Thread.currentThread().isDaemon());
//             System.out.println(Thread.currentThread().isAlive());
//         } catch (InterruptedException e) {
//             System.out.println(e);
//         }
//     }
//     public static void main(String[] args) throws InterruptedException{
//         //mainMethod = Thread.currentThread();
//         MultiThreading t1= new MultiThreading();
//         t1.setDaemon(true);
//         t1.start();
//         t1.interrupt();
//         t1.setName("manoj");
//         //t1.setPriority(8);
//         //Thread.currentThread().setPriority(10);
//         //t1.yield();
//         //t1.join();
//         //Thread.yield();
//         try {
//             Thread.sleep(2000);
//             System.out.println(Thread.currentThread().getName());
//         } catch (InterruptedException e) {
//             System.out.println(e);
//         }
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////



/////////////////////////////////////////////////////////////////////////////////////////////
//Using Thread Class
// public class MultiThreading extends Thread{
//     public void run(){
//         System.out.println(Thread.currentThread().getName());
//     }
//     public static void main(String[] args) {
//         MultiThreading t1 = new MultiThreading();
//         t1.start();
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////


//////////////////////////////////////////////////////////////////////////////////////////////
// Using Runnable , Runnable String
// public class MultiThreading implements Runnable{
//     public void run(){
//         //System.out.println("This is child thread");
//         System.out.println(Thread.currentThread().getName());
//     }
//     public static void main(String[] args) {
//         //Runnable obj =  new MultiThreading();//Creating Runnable class object
//         MultiThreading obj = new MultiThreading();
//         System.out.println(Thread.currentThread().getName());
//         //Thread t1 =  new Thread(obj,"Main Thread");//new state(Runnable target(obj))
//         Thread t1 = new Thread(obj);
//         t1.start();// active state
//         // String str = t1.getName();
//         // System.out.println(str);
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////