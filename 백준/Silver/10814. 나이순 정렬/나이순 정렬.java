import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(br.readLine());
            String[] str = new String[200];
            for(int i = 0; i<num; i++){
                String result = br.readLine();
                String[] tmp = result.split(" ");
                if(str[Integer.parseInt(tmp[0])-1]!=null){
                    str[Integer.parseInt(tmp[0])-1] = str[Integer.parseInt(tmp[0])-1].toString()+"\n"+result;
                }else{
                str[Integer.parseInt(tmp[0])-1] = result;
            }
            }
            for (int i = 0; i<200; i++) {
                if(str[i]!=null)
                System.out.println(str[i]);
            }
            
        } catch (Exception e) {
        }
    }
}