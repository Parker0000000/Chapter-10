import java.util.Scanner;

public class MyIntigerTest {
    public static void main(String[] args) throws Exception {
        int MyInt = 0;
        int thisone = 0;
        String why = "0";
        int i = 0;
        char[] hi = new char[i];
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how you will enter your info: ");
        System.out.println("1 One number, 2 Array of numbers, 3 String");
        thisone = input.nextInt();
        if (thisone == 1) {
            System.out.println("Enter one int: ");
            MyInt = input.nextInt();
        } else if (thisone == 2) {
            System.out.println("Enter amount of numbers");
            i = input.nextInt();
            System.out.println("Enter array of numbers: ");
            hi = new char[i];
            for (int w = 0; w < i; w++) {
                hi[w] = input.next().charAt(0);
                
            }
            
            
        }else {
            System.out.println("Enter string");
            why = input.nextLine();
        }
        
        MyInteger integer = new MyInteger(MyInt, i, why, thisone, hi);
        System.out.println(integer.isEven());
        System.out.println(integer.isOdd());
        System.out.println(integer.isPrime());
        System.out.println(integer.equals(MyInt));
        System.out.println(integer.parseint());
        
    }
}
