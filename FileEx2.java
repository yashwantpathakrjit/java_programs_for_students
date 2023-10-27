import java.io.FileWriter;  
public class FileEx2
{  
    public static void main(String args[])
    {    
         try{    
           FileWriter fw=new FileWriter("D:/DB2/hellojava2.txt");    
           fw.write("hello eveyone subscribe to my channel");    
           fw.close();    
          }
          catch(Exception e)
          {
			  System.out.println(e);}    
          System.out.println("Successfully written...");    
     }    
}  
