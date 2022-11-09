import java.util.Scanner;
class Result{
    int a1,a2,a3,total,percentage;
    String result;
   Result(int a,int b,int c){
       a1=a;
       a2=b;
       a3=c;
   }
   void calculation() {
       if(a1>=75 && a2>=75 && a3>=75)
           result="PROMOTED";
       else
           result="DEMOTED";
       total=a1+a2+a3;
       percentage=total/3;
       System.out.println("TOTAL:"+total);
       System.out.println("PERCENTAGE:"+percentage);
       System.out.println("YOU ARE "+result);
   }
   void display(int empid,String name){
       System.out.println("EMPLOYEE DETAILS\n");
       System.out.println("EMPLOYEE ID:"+empid);
       System.out.println("EMPLOYEE NAME:"+name);
       System.out.println("\nASSESSMENT RESULT\n");
       System.out.println("ASSESSMENT-1:"+a1);
       System.out.println("ASSESSMENT-2:"+a2);
       System.out.println("ASSESSMENT-3:"+a3);
   }
}
public class Employee {
    public static void main(String[] args)
    {
        int empid,asst1,asst2,asst3;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        empid= sc.nextInt();
        System.out.println("Enter Name:");
        name= sc.next();
        System.out.println("Assessment-1 Mark:");
        asst1= sc.nextInt();
        System.out.println("Assessment-2 Mark:");
        asst2= sc.nextInt();
        System.out.println("Assessment-3 Mark:");
        asst3= sc.nextInt();
        Result r=new Result(asst1,asst2,asst3);
        r.display(empid,name);
        r.calculation();
    }
}
