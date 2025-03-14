import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)throws IOException{
        // 라벨지에 "WelcomeToSMUPC" 라는 문구가
        // 공백없이 반복적으로 적혀 있을때
        // N번째 글자를 출력하는 프로그램을 작성하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String label = "WelcomeToSMUPC";
        int N = Integer.parseInt(br.readLine());
        System.out.println(label.charAt((N-1)%14));
    }
}