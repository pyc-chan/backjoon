import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] su = new int[9];
        int max = 0;
        int index = 0;
        for(int i = 0; i<9 ;  i++){
            su[i] = scan.nextInt();
            if(su[i]>max){
                max = su[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
        
        scan.close();
    }
}
