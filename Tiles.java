import java.util.Scanner;

class Tile{
    float tArea;
    Tile(int edge){
        tArea=(float)edge*edge;
    }
}
class Floor{
    float fArea;
    Floor(int length,int width){
        fArea=length*width;
        }
    void totalTiles(Tile t){
        float noOfTiles=fArea/t.tArea;
        System.out.println("Number of Tiles:"+noOfTiles);
    }
}
public class Tiles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the edge length of tile:");
        int e=sc.nextInt();
        Tile t=new Tile(e);
        System.out.println("Enter the length and width of floor:");
        int l=sc.nextInt();
        int w=sc.nextInt();
        Floor f=new Floor(l,w);
        f.totalTiles(t);
    }
}
