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

class Fthread extends Thread
{
Table t;

	Fthread(Table t)
	{
	this.t=t;
	}
	public void run() 
	{
	try{
	t.printTable(2);
	}catch(Exception e){System.out.println(e);}
	}
}

class Sthread extends Thread
{
Table t;

	Sthread(Table t)
	{
	this.t=t;
	}
	public void run() 
	{
	try{
	t.printTable(7);
	}catch(Exception e){System.out.println(e);}
	}
}

public class Sdemo
{
	public static void main(String args[])
	{
	Table tt=new Table();
	Fthread f=new Fthread(tt);
	Sthread s=new Sthread(tt);

	f.start();
	s.start();
	}
}
