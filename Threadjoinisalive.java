class NewThread implements Runnable {
    Thread t;
    String name;
    NewThread(String threadname){
        name=threadname;
        t= new Thread(this,name);
        System.out.println("new thread: "+ t);
        t.start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(name + ": "+ i);
                Thread.sleep(1000);
            }
        }
            catch(InterruptedException e){
                    System.out.println(name +" interuppted");
                    }
         System.out.println(name + "exiting");
        }
    }
   class joinisalive {
       public static void main(String args[]){
        NewThread ob1 = new NewThread("one");
        NewThread ob2 = new NewThread("two");
        NewThread ob3 = new NewThread("three");
        System.out.println("Thread one is alive:" + ob1.t.isAlive());
        System.out.println("Thread two is alive:" + ob2.t.isAlive());
        System.out.println("Thread three is alive:" + ob3.t.isAlive());
           try{ 
               System.out.println("waiting for threads to finish");
               ob1.t.join();
               ob2.t.join();
               ob3.t.join();
               }
               catch(InterruptedException e){
                       System.out.println("main thread interuppted");
                       }
            System.out.println("Thread one is alive:" + ob1.t.isAlive());
            System.out.println("Thread two is alive:" + ob2.t.isAlive());
            System.out.println("Thread three is alive:" + ob3.t.isAlive());
            System.out.println("main thread exiting");
           }
       }
        
