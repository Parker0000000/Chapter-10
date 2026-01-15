import java.util.Scanner;

public class MyIntigerTest {
    public static void main(String[] args) throws Exception {
        int MyInt = 0;

        Scanner input = new Scanner(System.in);
        MyInt = 4;
        System.out.println(MyInt);
        MyInteger integer = new MyInteger(MyInt);
        System.out.println(integer.isEven());
        if (MyInt % 2 == 0) {
            System.out.println("yes");
        } else { 
            System.out.println("hello");
        }
        
        
    }
}
