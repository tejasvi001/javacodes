package threads;

public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
    	
    	//Direct Access Using new Keyword
        (new Thread(new HelloRunnable())).start();
        
        //By creating an object
        Runnable runnable=new HelloRunnable();
        Thread obj=new Thread(runnable);
        obj.start();
        
        obj.run();
    }

}


//class a{}
//class b extends a implements Runnable{}


