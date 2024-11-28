import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<num; i++){
            String str = sc.nextLine();
            int result = 0;
            int combo = 1;
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(j)=='O'){
                    result = result+combo;
                    combo++;
                }else{
                    combo=1;
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}
