abstract class abc{
    abstract void show();
}

public class Anonymous_Abstract_class
{
    public static void main(String[] args)
    {
        abc obj1=new abc(){
            void show()
            {
                System.out.println("From anonymous Abstract class");
            }
        };
        obj1.show();
    }
}