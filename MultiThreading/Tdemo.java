class Prime implements Runnable
{
int i,j,count=1,flag=0;
Thread t;
Prime(){
    t=new Thread(this);
    t.start();
}
	public void run()
	{
	long start=System.currentTimeMillis();
	for(i=3;i>0;i++)
	{
		for(j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
			flag=1;
			break;
			}
		}
		if(flag==0)
		{
		System.out.println(i);
		count++;
		}
		flag=0;
		if(count==20)
		break;
	}
	long end=System.currentTimeMillis();
	System.out.println("time require for prime numbers "+(end-start)+"ms");
	}
}

class Fibonacci implements Runnable
{
int n1=0,n2=1,n3,i;
Thread t;
Fibonacci(){
     t=new Thread(this);
     t.start();
     
     }
    public void run()
    {
    try {
        Thread.sleep(100);
    } catch (InterruptedException e) {
        System.out.println("interuppted");
    }
	long start=System.currentTimeMillis();
	System.out.println(n1);
	System.out.println(n2);
	for(i=0;i<13;i++)
	{
	n3=n1+n2;
	System.out.println(n3);
	n1=n2;
	n2=n3;
	}
	long end=System.currentTimeMillis();
	System.out.println("time require for fibonacci series "+(end-start)+"ms");
	}
}
	
		
class Tdemo
{
	public static void main(String args[])
	{
       
            Prime p = new Prime();
            Fibonacci f = new Fibonacci();
        }
}
