//Author:Bhagyashree mulage
// WAP to show priority of a thread
package que5;

public class PriorityThread extends Thread {
	public void run()
	{
		System.out.println("-------------------------------");
	}

	public static void main(String[] args) {
		PriorityThread t1=new PriorityThread();
		PriorityThread t2=new PriorityThread();
		System.out.println("deault priority thread t1 is "+t1.getPriority());
		System.out.println("deault priority thread t2 is "+t2.getPriority());//getting the default priority
		t1.start();
		t1.setPriority(6);		//setting  priority manually
		System.out.println("set priority thread t1 is "+t1.getPriority());//getting te priority
		t2.start();
	
}

}
