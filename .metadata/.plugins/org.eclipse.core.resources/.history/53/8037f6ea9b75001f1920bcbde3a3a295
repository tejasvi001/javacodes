package threads;

public class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello from a thread!");
    }
    //
    public static void main(String args[]) {
    	//Direct Access Using new Keyword
        (new  HelloThread()).start();
        //By Creating an object and then access.
        Thread obj=new HelloThread();
//        Parent objname=new ChildClAss();
        obj.start();
        
        obj.run();
    }
}
