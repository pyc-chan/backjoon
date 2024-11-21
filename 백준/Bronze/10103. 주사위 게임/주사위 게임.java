import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int chang = 100;
        int sang = 100;

        int round = scan.nextInt();

        for(int i = 1; i<= round; i++){
            int changsu = scan.nextInt();
            int sangsu = scan.nextInt();

            if(changsu > sangsu){
                sang = sang - changsu;
            }else if (sangsu > changsu){
                chang = chang - sangsu;
            }
        }

        System.out.println(chang + "\n" + sang);

        scan.close();
    }
}
