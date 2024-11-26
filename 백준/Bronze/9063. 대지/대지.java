import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int su = scan.nextInt();
        if(su <= 1){
            System.out.println(0);
        }else{
            int maxx=-10000;
            int maxy=-10000;
            int minx=10000;
            int miny=10000;
        for(int i = 0; i < su; i++){
            int tmpx = scan.nextInt();
            int tmpy = scan.nextInt();
            if(tmpx > maxx){
                maxx=tmpx;
            }
            if(tmpy > maxy){
                maxy=tmpy;
            }
            if(tmpx < minx){
                minx=tmpx;
            }
            if(tmpy < miny){
                miny=tmpy;
            }
        }
        System.out.println((maxx-minx)*(maxy-miny));
        

    }
        scan.close();

    }
}
