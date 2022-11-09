class OneBHK
{
    double roomArea;
    double hallArea;
    double price;

    OneBHK()
    {
        roomArea = 135;
        hallArea = 160;
        price = 1300000;
    }

    OneBHK(double room_area, double hall_area, double price1)
    {
        roomArea = room_area;
        hallArea = hall_area;
        price =price1 ;
    }

    void show()
    {
        System.out.println("Room Area"+roomArea);
        System.out.println("Hall Area"+hallArea);
        System.out.println("Price"+price);
    }
}
class TwoBHK extends OneBHK {
    double room2Area;

    TwoBHK()
    {
        room2Area = 120;
    }

    TwoBHK(double room_area,double hall_area,double price1,double room2area)
    {
        super.roomArea=room_area;
        super.hallArea=hall_area;
        super.price=price1;
        room2Area = room2area;
    }

    void show()
    {
        System.out.println("Room Area:" +super.roomArea);
        System.out.println("Hall Area:" +super.hallArea);
        System.out.println("Price:" +super.price);
        System.out.println("Room2 Area:" + room2Area);
    }
}

public class Driver_Class
{
    public static void main(String[] args)
    {
        System.out.println("Flat Details\n");
        System.out.println("Flat1\n");
        TwoBHK t1=new TwoBHK(160,180,1560000,120);
        t1.show();
        System.out.println("\nFlat2\n");
        TwoBHK t2=new TwoBHK(130,160,1330000,140);
        t2.show();
        System.out.println("\nFlat3\n");
        TwoBHK t3=new TwoBHK(135,140,1270000,120);
        t3.show();
        double total=t1.price+ t2.price+t3.price;
        System.out.println("\nTotal Price:"+total);
    }
}
