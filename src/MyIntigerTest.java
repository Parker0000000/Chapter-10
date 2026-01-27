import java.util.Scanner;

public class MyIntigerTest {
    public static void main(String[] args) throws Exception {
        int MyInt;
        
        Scanner input = new Scanner(System.in);
        MyInt = input.nextInt();
        MyInteger integer = new MyInteger(MyInt);
        System.out.println(integer.isEven());
        System.out.println(integer.isOdd());
        System.out.println(integer.isPrime());
        System.out.println(integer.equals(MyInt));
        
        
    }
}
