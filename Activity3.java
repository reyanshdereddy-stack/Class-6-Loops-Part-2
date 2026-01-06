import java.util.Scanner;
class Activity3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lower number");
        int low = s.nextInt();
        System.out.println("Enter the higher number");
        int high = s.nextInt();
        for(int n=low; n<=high; n++){
            int count=0;
            for(int div=2; div*div<=n; div++){
                if (n % div == 0) {
                    count++;
                    break;
                }}
                if (count==0) {
                    System.out.println(n);
                }
            }
        }
    
    }

