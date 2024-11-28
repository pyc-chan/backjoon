import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<num; i++){
            int height = sc.nextInt();
            int width = sc.nextInt();
            int idx = sc.nextInt();
            int firstnum = idx%height==0 ? height : idx%height;
            int lastnum = idx%height==0? idx/height : 1+(idx/height);
            String result = lastnum<10 ? firstnum+"0"+lastnum:firstnum+""+lastnum;
            System.out.println(result);
        }
        sc.close();
    }
}
