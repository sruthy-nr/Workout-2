import java.util.Scanner;
class Faculty
{
    int facultyId;
    float salary;
    String name;

    Scanner sc=new Scanner(System.in);
    public void read()
    {}
    public void display()
    {}
}
class FullTimeFaculty extends Faculty
{
  float basic,allowance;
    public void read()
    {
        System.out.println("Full Time Faculty");
        System.out.println("Enter the Faculty ID:");
        facultyId=sc.nextInt();
        System.out.println("Enter the Name:");
        name=sc.next();
        System.out.println("Enter the Basic:");
        basic=sc.nextFloat();
        System.out.println("Enter the Allowance:");
        allowance=sc.nextFloat();
    }

    @Override
    public void display()
    {
        System.out.println("Faculty ID:"+facultyId);
        System.out.println("Name:"+name);
        System.out.println("Basic:"+basic);
        System.out.println("Allowance:"+allowance);
        salary=basic+allowance;
        System.out.println("Salary:"+salary);
    }
}
class PartTimeFaculty extends Faculty
{
    int hour;
    float rate;
    public void read()
    {
        System.out.println("Part Time Faculty");
        System.out.println("Enter the Faculty ID:");
        facultyId=sc.nextInt();
        System.out.println("Enter the Name:");
        name=sc.next();
        System.out.println("Enter Hour:");
        hour=sc.nextInt();
        System.out.println("Enter Rate:");
        rate=sc.nextFloat();
    }

    @Override
    public void display()
    {
        System.out.println("Faculty ID:"+facultyId);
        System.out.println("Name:"+name);
        System.out.println("Hour:"+hour);
        System.out.println("Rate:"+rate);
        salary=hour*rate;
        System.out.println("Salary:"+salary);
    }
}
public class DriverClass {
    public static void main(String[] args)
    {
        FullTimeFaculty f=new FullTimeFaculty();
        FullTimeFaculty f2=new FullTimeFaculty();
        PartTimeFaculty p=new PartTimeFaculty();
        PartTimeFaculty p2=new PartTimeFaculty();
        f.read();
        f2.read();
        p.read();
        p2.read();
        System.out.println("Full Time Faculty\n");
        f.display();
        f2.display();
        System.out.println("\nPart Time Faculty\n");
        p.display();
        p2.display();
    }
}
