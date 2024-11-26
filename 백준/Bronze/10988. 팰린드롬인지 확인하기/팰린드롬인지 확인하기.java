import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.trim();
        int num = str.length();
        char[] chars = str.toCharArray();
        int result = 1;
        for(int i = 0; i<num/2; i++){
            if(chars[i] != chars[num-1-i]){
                result = 0;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
