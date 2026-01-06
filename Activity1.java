import java.util.Scanner;
class Activity1 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=1; i<=t; i++){
            int n = s.nextInt();
            int count=0;
            for(int div=2; div*div <= n; div++){
                if (n % div == 0) {
                    count++;
                    
                    break;
                }
            }
        
        if (count == 0) {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}}
