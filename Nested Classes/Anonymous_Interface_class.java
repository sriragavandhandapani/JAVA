interface greet{
     void display();
}

public class Anonymous_Interface_class
{
    public static void main(String[] args)
    {
        greet obj1=new greet(){
            public void display()
            {
                System.out.println("From anonymous Interface");
            }
        };
        obj1.display();
    }
}