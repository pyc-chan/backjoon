import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String str = scan.nextLine();
            if (str.equals("EOI")){
                break;
            }
            int index = str.toLowerCase().indexOf("nemo".toLowerCase());
            if(index == -1){
                System.out.println("Missing");
            }else{
                System.out.println("Found");
            }
            
        }
        
        scan.close();
    }
}
