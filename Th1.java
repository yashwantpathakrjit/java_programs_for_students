class Th1 implements Runnable// java.lang.Runnable 
{
    public void run()
    {
        System.out.println("my thead is running");

    }
    public static void main(String args[])
    {
        Th1 m1=new Th1();
        
        Thread t1=new Thread(m1);
        t1.start();

    }
}