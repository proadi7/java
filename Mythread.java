package exampless;
import java.lang.Thread;

public class Mythread extends Thread
{
	int []val = {1,2,3,4,5};
	public void run()
	{
		for(int i=0;i<5;i++)
			{
				val[i]=val[i]*2;
				System.out.println(val[i]);
			}
	}
	
	public static void main(String[] args) 
	{
		Thread t1 = new Mythread();
		t1.start();
	}
}