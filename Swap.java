public class Swap {
    int n;
    Swap(int n)
    {
        this.n=n;
    }
    public static void main(String[] args) {
        int x = 1,y=2;
        System.out.println("Call by value");
        System.out.println("Before swapping a="+x+"\tb="+y);
        swapByValue(x,y);
        System.out.println("\n");
        Swap a = new Swap(1);
        Swap b = new Swap(2);
        System.out.println("Call by references");
        System.out.println("Before swapping a="+a.n+"\tb="+b.n);
        swapByReference(a,b);
        System.out.println("After swapping a="+a.n+"\tb="+b.n);
    }
    public static void swapByValue(int x,int y)
    {
        int z=x;
        x=y;
        y=z;
        System.out.println("After swapping a="+x+"\tb="+y);
    }
    public static void swapByReference(Swap a,Swap b)
    {
        Swap c=new Swap(a.n);
        a.n=b.n;
        b.n=c.n;
    }
}
