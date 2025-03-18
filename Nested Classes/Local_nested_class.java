//Without constructor

public class Local_nested_class{
    private int data=30;
    void display(){
    class Local{
        void msg(){
            System.out.println(data);
        }
    }
        Local l=new Local();
        l.msg();
    }
    public static void main(String[] args)
    {
        Main obj=new Main();
        obj.display();
    }
}


// With constructor

public class Local_nested_class{
    private int data=30;
    Main()
    {
        System.out.println("Displaying the Constructor");
        int a=data+10;
        System.out.println("After adding 10 in the data: "+a);
    }
    void display(){
    class Local{
        void msg(){
            System.out.println(data);
        }
    }
        Local l=new Local();
        l.msg();
    }
    public static void main(String[] args)
    {
        Main obj=new Main();
        obj.display();
    }
}