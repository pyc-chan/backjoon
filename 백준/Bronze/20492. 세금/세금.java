import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)throws IOException{
        // 전체 상금이 주어졌을때
        // 제세공과금 22%를 제외한 상금과
        // 상금의 80%를 필요 경비로 인정하여
        // 나머지 20%중 22%만을 제세공과금으로 납부할 때 상금
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int price = Integer.parseInt(br.readLine());
        int aftertex1 = price - (price/100*22);
        int aftertex2 = price - (price/5/100*22);
        System.out.println(aftertex1 + " " + aftertex2);
    }
}