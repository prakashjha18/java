import java.lang.*;

class Table
{
	public synchronized void printTable(int n) throws Exception
	{
	System.out.println("Table of "+n);
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
			try{
			Thread.sleep(500);
	     		}catch(Exception e){System.out.println(e);}
		}
	}
}

class Fthread implements Runnable 
{
Table t;
Thread t1;

	Fthread(Table t)
	{
	this.t=t;
        t1=new Thread(this);
        t1.start();
	}
	public void run() 
	{
	try{
	t.printTable(2);
	}catch(Exception e){System.out.println(e);}
	}
}

class Sthread implements Runnable 
{
Table t;
Thread t1;
       

	Sthread(Table t)
	{
	this.t=t;
        t1=new Thread(this);
        t1.start();
	}
	public void run() 
	{
	try{
	t.printTable(7);
	}catch(Exception e){System.out.println(e);}
	}
}

public class Sdemo1
{
	public static void main(String args[])
	{
	Table tt=new Table();
	Fthread f=new Fthread(tt);
	Sthread s=new Sthread(tt);

	
	
	}
}
