class ExcEx3 extends Thread{  
 public void run()
 {  
  for(int i=1;i<5;i++)
  {  
    try
    {
        Thread.sleep(2000);
    }
    catch(InterruptedException e)
    {
        System.out.println(e);
    }  
    
    System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
  ExcEx3 t1=new ExcEx3();  
  ExcEx3 t2=new ExcEx3();  
  ExcEx3 t3=new ExcEx3();
  t1.start();  
  t2.start();  
  t3.start();
 }  
}  