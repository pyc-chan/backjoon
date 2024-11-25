import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();

        for(int i = 0; i<test; i++){
            int su = scan.nextInt();
            String str = scan.nextLine();
            str = str.trim();
            for(int j = 0; j<str.length(); j++){
                for(int k = 0; k<su; k++){
                    System.out.print(str.charAt(j));
                }
            }
            if(i!=test-1){System.out.println();}
        }
        scan.close();
    }
}
