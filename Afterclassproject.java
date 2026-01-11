import java.util.Scanner;
class Afterclassproject {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive number. This number will be rotated by the next number you enter.");
        int number = s.nextInt();
        if (number<0){
            System.out.println("Please enter a non-negative number.");
            System.exit(number);
        }
        System.out.println("Enter a number. This number is the number which the previous number you entered will be rotated by.");
        int rotatingnumber = s.nextInt();
        if (rotatingnumber<0){
            System.out.println("Please enter a non-negative number.");
            System.exit(rotatingnumber);
        }
        String numString = String.valueOf(number);
        int length = numString.length(); 
        int remainder = rotatingnumber % length;
        String String1 = numString.substring(0, length-(remainder));
        String String2 = "";
        if (remainder>0) {
            String2 = numString.substring(remainder);
        }
        
        System.out.println(String2+String1);
    }
}
