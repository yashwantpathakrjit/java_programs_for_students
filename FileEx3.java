import java.io.*;
public class FileEx3
{  
    public static void main(String[] args) throws Exception 
    {     
    FileWriter writer = new FileWriter("f:/hellojava2.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("hello every one like share subscribe");  
    buffer.close();  
    System.out.println("Success");  
    }  
}    
