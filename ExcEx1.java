class ExcEx1
{
    public static void main(String args[])
    {
        try{
            System.out.println(30/0);
            System.out.println("divison is complete ");
        
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid value given plz retry"+e.getMessage());

        }
        }
    }

    
