package threads.states;

public class ThreadStates {

	public ThreadStates() {
		// TODO Auto-generated constructor stub
		for(Thread.State c : Thread.State.values()) {
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadStates obj=new ThreadStates();
		
	}

}
