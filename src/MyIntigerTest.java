import java.util.Scanner;

public class MyIntigerTest {
    public static void main(String[] args) throws Exception {
        int MyInt = 0;

        Scanner input = new Scanner(System.in);
        MyInt = 1 % 2;
        System.out.println(MyInt);
        MyInteger integer = new MyInteger(MyInt);
        if (MyInteger.isEven() == true) {
        System.out.println(MyInt + " Is even");
        } else {
            System.out.println(MyInt + " Is not even");
        }
        if (MyInteger.isOdd() == true) {
        System.out.println(MyInt + " Is not odd");
        } else {
            System.out.println(MyInt + " Is odd");
        }
        
        
    }
}
