import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a,b,c,tmp;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        int[] all = {a,b,c};

        for(int i=0; i<3; i++){
            if(i==0){
                if(all[i]>all[2]){
                    tmp = all[i];
                    all[i] = all[2];
                    all[2] = tmp;
                }
            }else if(all[i]<all[i-1]){
                tmp = all[i];
                all[i] = all[i-1];
                all[i-1] = tmp;
            }
        }

        if(all[0]==all[2]){
            System.out.println(10000+all[0]*1000);
        }else if(all[0]==all[1]||all[1]==all[2]){
            System.out.println(1000+all[1]*100);
        }else{
            System.out.println(all[2]*100);
        }
        scan.close();
    }
}
