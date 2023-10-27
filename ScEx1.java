import java.util.Scanner; 

class ScEx1 
{
  public static void main(String[] args) 
  {
    int x, y, sum;
    Scanner ob1 = new Scanner(System.in); 
    System.out.println("Type a number:");
    x = ob1.nextInt(); 

    System.out.println("Type another number:");
    y = ob1.nextInt(); 

    sum = x + y;  
    System.out.println("Sum is: " + sum); 
  }
} 