class Outer
{
     class Inner{
        void f1()
        {
            System.out.println("i came from inner class");
        }


    }
}
class Inn1
{
    public static void main(String args[])
    {
        Outer obj1=new Outer();
        Outer.Inner obj2= obj1.new Inner();


        obj2.f1();


    }
}