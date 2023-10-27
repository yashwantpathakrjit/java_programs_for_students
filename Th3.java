class Th3 extends Thread
{  
 public void run()
 {  
  for(int i=1;i<=5;i++)
  {  
   try
   {  
    Thread.sleep(1500);  
   }
   catch(Exception e)
   {
       System.out.println(e);
    }  
  System.out.println(i);  
  }  
 }  
public static void main(String args[])
{  
 Th3 t1=new Th3();  
 Th3 t2=new Th3();  
 Th3 t3=new Th3();  
 t1.start(); 
  
 try
 {  
  t1.join();  
 }
 catch(Exception e)
 {
     System.out.println(e);
    } 
  
 t2.start();  
 t3.start();  
 }  
}  