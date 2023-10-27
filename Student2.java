class Student2
{
    private String roll,name,branch;
public void setDetail(String r,String n,String b)
{
    roll=r;
    name=n;
    branch=b;

}
public void showDetail()
{
    System.out.println(roll);
    System.out.println(name);
    System.out.println(branch);

}

}

class Ex1
{
    public static void main()
    {
        Student2 s1=new Student2();
        s1.setDetail("yash", "0901", "cse");
  s1.showDetail();
    }

}
