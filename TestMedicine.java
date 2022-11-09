class Medicine{
    void displayLabel() {

        System.out.println("Company:Cipla\nAddress:Ernakulam");
    }
}
class Tablet extends Medicine {
    @Override
    void displayLabel() {
        System.out.println("Medicine Type:Tablet\nstore in a cool dry place(below 86`F)");
    }
}
class Syrup extends Medicine{
    @Override
    void displayLabel(){
        System.out.println("Medicine Type:Syrup\nstore in a cool, dry & dark place");
    }
}
class Ointment extends Medicine{
    @Override
    void displayLabel() {
        System.out.println("Medicine Type:Ointment\nfor external use only");
    }
}
public class TestMedicine {
    public static void main(String[] args) {
        Medicine[] m = new Medicine[4];
        m[0] = new Medicine();
        int min=1;
        int max=3;
        int i=(int)(Math.random()*(max-min+1))+min;
        System.out.println(i);
        switch (i){
            case 1:m[i] = new Tablet();
                m[0].displayLabel();
                m[i].displayLabel();
                break;
            case 2: m[i] = new Syrup();
                m[0].displayLabel();
                m[i].displayLabel();
                break;
            case 3:m[i] = new Ointment();
                m[0].displayLabel();
                m[i].displayLabel();
                break;
            default: System.out.println("Invalid Choice");
        }
    }
}
