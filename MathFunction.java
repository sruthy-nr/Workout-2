public class MathFunction
{
    static void multiply(int a,int b)
    {
        System.out.println(a+"*"+b+"="+a*b);
    }
    static void multiply(float a,float b)
    {
        System.out.println(a+"*"+b+"="+a*b);
    }
    static void multiply(float a,int b)
    {
        System.out.println(a+"*"+b+"="+a*b);
    }
    public static void main(String[] args)
    {
        multiply(2,3);
        multiply(2.5f,4.5f);
        multiply(1.5f,3);
    }
}
