public class NumberOfInstances {
    public static int count=0,countD=0;
    NumberOfInstances () {
        count++;
    }
//   void show(){
//       System.out.println("");
//    }
    public static void main(String[] args) throws InterruptedException
    {
        NumberOfInstances t1,t2,t3;
        t1=new NumberOfInstances();
        t2=new NumberOfInstances();
        t3=new NumberOfInstances();
        int a,d,c=count;
        System.out.println("Number of instances created:"+count);
//        t1.show();
//        t2.show();
        t3=null;
        System.gc();
        Runtime.getRuntime().gc();
        d=countD;
        a=c-d;
        System.out.println("Number of instances destroyed:"+countD);
        System.out.println("Number of instances alive:"+a);
    }

    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        countD++;
//        System.out.println("garbage collector called "+this);

    }
}
