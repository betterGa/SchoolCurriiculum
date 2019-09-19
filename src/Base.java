public class Base {
    private int x;

    public Base()
    {super();
    x=0;}

    public Base(int x)
    {super();
    this.x=x;}

    public void Print()
    {System.out.println("x="+x);}

    public static void main(String[] args) {
DA da=new DA(3,5);
    da.Print();

}}
class DA extends Base
{private int y;
    public DA()
    {super();
    y=0; }

    public  DA(int x,int y)
    {super(x);

    //这个"x"是形参传来的x,改成this.x会报错
    this.y=y;
    }

    public void Print() {
        super.Print();
        System.out.println("y="+y);
    }
}