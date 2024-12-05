import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        try {
            while(true){
                count++;
            String[] str = br.readLine().split(" ");
            int average = Integer.parseInt(str[0]);
            int weight = Integer.parseInt(str[1]);
            if(average == 0 && weight == 0){
                break;
            }
            while(true){
                String tmp = br.readLine();
                if(tmp.equals("# 0")){
                    break;
                }else{
                    String[] tmps = tmp.split(" ");
                    int num = Integer.parseInt(tmps[1]);
                    if(tmps[0].equals("F")){
                        weight = weight+num;
                    }else if(tmps[0].equals("E")){
                        weight = weight-num;
                    }
                    if(weight <=0){
                        average = 0;
                    }
                }
                
            }
            System.out.print(count);
            if(average == 0){
                System.out.println(" RIP");
            }else if(weight < (average*2) && weight > (average/2)){
                System.out.println(" :-)");
            }else{
                System.out.println(" :-(");
            }
        }
        } catch (Exception e) {
        }
    }
}