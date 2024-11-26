import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int su1 = scan.nextInt();
        int su2 = scan.nextInt();
        int su3 = scan.nextInt();

        int su12 = su1+su2;
        int su13 = su1+su3;
        int su23 = su2+su3;

        if(su1>=su23){
            su1 = su23-1;
        }else if(su2>=su13){
            su2 = su13-1;
        }else if(su3>=su12){
            su3 = su12-1;
        }

        System.out.println(su1+su2+su3);
        
        scan.close();

    }
}
