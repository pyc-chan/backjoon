import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            
            int su = Integer.parseInt(br.readLine());
            if (su == 1) {
                int next = Integer.parseInt(br.readLine());
                System.out.println(next * next);
            } else {
                int[] yak = new int[su];
                int min = 0;
                int max = 0;
                String[] str = br.readLine().split(" ");
                for (int i = 0; i < su; i++) {
                    yak[i] = Integer.parseInt(str[i]);
                    if (i == 0) {
                        min = yak[i];
                        max = yak[i];
                    } else {
                        if (yak[i] < min) {
                            min = yak[i];
                        }
                    }if(yak[i]> max){
                        max = yak[i];
                    }
                    
                }
                System.out.println(max*min);
            }
            br.close();
        } catch (Exception e) {
        }
            
    }
}
