import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            int num = Integer.parseInt(str);
            int result = 0;
            if(num>18){
                for(int i = num-(9*str.length()); i < num; i++){
                    String tmp = String.valueOf(i);
                    int num2 = i;
                    for(int j = 0; j < tmp.length(); j++){
                        num2 = num2+(int)(tmp.charAt(j)-'0');
                    }
                    if(num2 == num){
                        result = i;
                        break;
                    }
                }
                
            }else{
                if(num%2==0){
                    result = num/2;
                }else if(num>10){
                    result = 9+((num-9)/2);
                }else{
                    result = 0;
                }
            }
            System.out.println(result);
            br.close();
        } catch (Exception e) {
        }
    }
}
