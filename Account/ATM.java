import java.util.Scanner;

public class ATM {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int newID=0;
        double newbalance =0;
        double newintrest=0;
        double withdraw=0;
        double deposit=0;
        double newdate=0;
        int jh = 0;
        int y = 1;
        //double[] w = new double[9];
        while (y > 0) {
        System.out.println("Enter ID");
        newID = input.nextInt();
        System.out.println("Enter what you will be doing today: 1 deposit, 2 withdraw, 3 exit");
        int kj = input.nextInt();
            if (kj == 1) {
            System.out.println("Enter deposit amount:");
            deposit = input.nextDouble();
        } else if (kj == 2) {
            System.out.println("Enter Withdraw amount:");
            withdraw = input.nextDouble();
        }else if (kj == 3) {
            break;
        }
        Account atm = new Account(newID, newbalance, newintrest, withdraw, deposit, newdate, jh);
        if (kj == 1) {
            System.out.println(atm.Deposit());
        } else if (kj == 2) {
            System.out.println(atm.Withdraw());
        }
        }
        
        
        
    }
}
