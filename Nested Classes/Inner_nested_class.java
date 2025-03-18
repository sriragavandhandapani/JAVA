// You are using Java
class Outer{
    static int outer_x=10;
    int outer_y=20;
    private static int outer_private=30;
    class Inner{
        void display()
        {
            System.out.println("outer_x= "+outer_x);
            System.out.println("outer_private= "+outer_private);
            //Ssytem.out.println("outer_y="+outer_y);   It will show the error bcz it's not static, so we have to implement by using object.
            //Outer out=new Outer();   Not necessary for inner nested class
            System.out.println("outer_y= "+outer_y);
        }
    }
}

public class Inner_nested_class{
    public static void main(String[] args)
    {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}