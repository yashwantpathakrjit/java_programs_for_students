abstract class Rj1
{
    abstract void read();

}
class Anon1
{
    public static void main(String args[])
    {
        Rj1 p=new Rj1()
        {
            void read()
            {
                System.out.println("i am disco dancer");
            }

        };
        p.read();
    }
}