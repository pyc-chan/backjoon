import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            
        
        int su1 = scan.nextInt();
        int su2 = scan.nextInt();
        int su3 = scan.nextInt();
        
        if(su1==0 && su2==0 && su3==0){
            break;
        }

        int su12 = su1+su2;
        int su13 = su1+su3;
        int su23 = su2+su3;
        if(su1>=su23||su2>=su13||su3>=su12){
            System.out.println("Invalid");
        }else if(su1 == su2 && su1 == su3){
            System.out.println("Equilateral");
        }else if(su1 == su2 || su1 == su3 || su2 == su3){
            System.out.println("Isosceles");
        }else{
            System.out.println("Scalene");
        }

    }
        scan.close();

    }
}
