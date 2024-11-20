import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        
        switch (a) {
            case "M":
                System.out.println("MatKor");
                break;
            case "W":
                System.out.println("WiCys");
                break;
            case "C":
                System.out.println("CyKor");
                break;
            case "A":
                System.out.println("AlKor");
                break;
            case "$":
                System.out.println("$clear");
                break;
        
        }
        

        scan.close();
    }
}
