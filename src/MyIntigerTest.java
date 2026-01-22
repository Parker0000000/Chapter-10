import java.util.Scanner;

public class MyIntigerTest {
    public static void main(String[] args) throws Exception {
        int MyInt;

        Scanner input = new Scanner(System.in);
        MyInt = input.nextInt();
        System.out.println(MyInt);
        MyInteger integer = new MyInteger(MyInt);
        System.out.print("Is " + MyInt + " even: ");
        System.out.println(integer.isEven());
        System.out.print("Is " + MyInt + " odd: ");
        System.out.println(integer.isOdd());
        System.out.print("Is " + MyInt + " prime: ");
        System.out.println(integer.isPrime());
        
        
    }
}
