import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int su1 = scan.nextInt();
        int su2 = scan.nextInt();
        int su3 = scan.nextInt();
        if(su1+su2+su3!= 180){
            System.out.println("Error");
        }else if(su1 == su2 && su1 == su3){
            System.out.println("Equilateral");
        }else if(su1 == su2 || su1 == su3 || su2 == su3){
            System.out.println("Isosceles");
        }else{
            System.out.println("Scalene");
        }
        scan.close();

    }
}
