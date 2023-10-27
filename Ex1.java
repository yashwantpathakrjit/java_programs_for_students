class Student2
{
    private String name,branch,city;
public void setDetail(String n,String b,String c)
{
    name=n;
    
    branch=b;
    city=c;
}
public void showDetail()
{
    System.out.println(name);
    System.out.println(branch);
    System.out.println(city);

}

}

class Ex1
{
    public static void main(String args[])
    {
        Student2 s1=new Student2();
        s1.setDetail("John", "cse", "datia");
  s1.showDetail();
  s1=new Student2();
 // s1.showDetail();
    }

}
