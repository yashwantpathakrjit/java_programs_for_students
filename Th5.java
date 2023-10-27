class Th5 extends Thread

{  
  public void run()
  {  
   System.out.println(" Set Name is working ");  
  }  
 public static void main(String args[])
 {  
  Th5 t1=new Th5();  
  Th5 t2=new Th5();  
  System.out.println("Name of t1:"+t1.getName());  
  System.out.println("Name of t2:"+t2.getName());  
   
  t1.start();  
  t2.start();  
  
  t1.setName("YP tech Thread ");  
  System.out.println("After changing name of t1:"+t1.getName());  
 }  
}  