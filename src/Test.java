public class Test {
private int x;
private int y;

    @Override
    public String toString() {
        return "Test{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    //无参构造
    public Test()
    {x=0;
    y=0;}

    //有参构造
    public Test(int x,int y)
    {this.x=x;
    this.y=y;}

    public static void main(String[] args) {
        Test t1=new Test(3,4);
        Test t2=new Test(5,6);
        System.out.println("t1="+t1);
        System.out.println("t2="+t2);
    //t1.copy(t2);
    t2.copy(t1);
    //这是调用copy(),是把t1的属性赋给t2
        System.out.println("copy后的t1"+t1);
        System.out.println("copy后的t2"+t2);
    }

public void copy(Test t)
{t.x=this.x;
t.y=this.y;
}

//如果是要把t2的属性赋给t1 t2.copy(t1)
    public void copy1(Test t)
    {
       t.x=this.x;
    t.y=this.y;
    }

}
