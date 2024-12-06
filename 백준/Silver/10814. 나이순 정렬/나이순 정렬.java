import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(br.readLine());
            int[] number = new int[200];
            Map str = new HashMap<Integer, String>();
            for(int i = 0; i<num; i++){
                String result = br.readLine();
                String[] tmp = result.split(" ");
                if(str.get(Integer.parseInt(tmp[0])-1)!=null){
                    String add = str.get(Integer.parseInt(tmp[0])-1).toString()+"\n"+result;
                    str.put(Integer.parseInt(tmp[0])-1, add);
                }else{
                str.put(Integer.parseInt(tmp[0])-1, result);
            }
                number[Integer.parseInt(tmp[0])-1] += 1;
            }
            
            for(int i = 0; i<200; i++){
                if(number[i] != 0)
                System.out.println(str.get(i));
            }
            
        } catch (Exception e) {
        }
    }
}