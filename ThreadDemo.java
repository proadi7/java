package exampless;


class A extends Thread
{
	public void run()
	{
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("hi");
			try{sleep(500);} catch(Exception e) {}
		}

	}
}

class B extends Thread
{
	public void run()
	{
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("bye");
			try{sleep(500);} catch(Exception e) {}
		}
	}
}

public class ThreadDemo 
{
	public static void main(String[] args) 
	{
		A ob1 = new A();
		B ob2 = new B();
		
		ob1.start();
		ob2.start();
	}
}
