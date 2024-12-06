import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int su = Integer.parseInt(br.readLine());
            if (su == 1) {
                int next = Integer.parseInt(br.readLine());
                System.out.println(next * next);
            } else {
                int min = 0;
                int max = 0;
                String[] str = br.readLine().split(" ");
                for (int i = 0; i < su; i++) {
                    int tmp = Integer.parseInt(str[i]);
                    if (i == 0) {
                        min = tmp;
                        max = tmp;
                    } else {
                        if (tmp < min) {
                            min = tmp;
                        }else if(tmp> max){
                            max = tmp;
                        }
                    }
                    
                }
                System.out.println(max*min);
            }
            br.close();
        } catch (Exception e) {
        }
            
    }
}
    