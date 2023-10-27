public class Fin1 {
     public static void main(String[] args) 
    { 
        Fin1 obj = new Fin1(); 
        System.out.println(obj.hashCode()); 
        obj = null; 
        
        System.gc(); 
        System.out.println("end of garbage collection"); 

    } 
    
    protected void finalize() 
    { 
        System.out.println("finalize method called"); 
    } 
}
