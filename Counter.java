class Counter 
{
  static int count=0;// will get memory before ...
  Counter()
  {
count++;
System.out.println(+count);
  }
  public static void main(String args[])
  {
    Counter a=new Counter();
    Counter b =new Counter();
    Counter c=new Counter();

  }


}