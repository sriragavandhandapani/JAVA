// You are using Java
class Outer{
    static int outer_x=10;
    int outer_y=20;
    private static int outer_private=30;
    static class Staticclass{
        void display()
        {
            System.out.println("outer_x= "+outer_x);
            System.out.println("outer_private= "+outer_private);
            //Ssytem.out.println("outer_y="+outer_y);   It will show the error bcz it's not static, so we have to implement by using object.
            Outer out=new Outer();
            System.out.println("outer_y= "+out.outer_y);
        }
    }
}

public class Static_nested_classes{
    public static void main(String[] args)
    {
        Outer.Staticclass nob= new Outer.Staticclass();
        nob.display();
    }
}