import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int su = scan.nextInt();
        if (su == 1) {
            int next = scan.nextInt();
            System.out.println(next * next);
        } else {

            int[] yak = new int[su];
            int min = Integer.MAX_VALUE;
            int max = 1;

            for (int i = 0; i < su; i++) {
                yak[i] = scan.nextInt();
                if (i == 0) {
                    min = yak[i];
                } else {
                    if (yak[i] < min) {
                        min = yak[i];
                    }
                }
                if(yak[i]> max){
                    max = yak[i];
                }

            }
            System.out.println(max*min);
        }

        scan.close();

    }
}
