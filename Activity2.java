import java.util.Scanner;
class Activity2 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int div=2; div * div <= n; div++){
            while (n % div == 0) {
                n=n/div;
                System.out.println(div+"");
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
    }
}
