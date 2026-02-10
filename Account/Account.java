import java.util.Date;
import java.time.LocalDate;

public class Account {
    private int ID;
    private double balance;
    private double annualinterestrate;
    private Date datecreated;
    double days;
    double newamount;
    double newasdf;
    double newbalance;
    Date currentDate = new Date();
    LocalDate date = LocalDate.now();
    int year = date.getYear();
    int month = date.getMonthValue();
    int day = date.getDayOfMonth();

    Account() {
        ID = 0;
        balance =0;
        annualinterestrate = 0;
        datecreated = currentDate;
    }

    Account(int newID, double newbalance, double newintrest, double withdraw, double deposit, double newdate, double[] w) {
        ID = newID;
        balance = newbalance;
        annualinterestrate = newintrest;
        newamount = withdraw;
        newasdf = deposit;
        days = newdate;
        double[] idbalance = new double[9];
        for (int q = 0; q <= 9; q++) {
            
            idbalance[ID] = 100;
            ID++;
        }
    }
    double d() {

        return 0;
    }

    int ID() {
        return ID;
    }
    double getmonthlyintrestrate() {
        return (annualinterestrate / 100); 
    }
    double monthlyintrest() {
        return balance * (days * getmonthlyintrestrate());
    }
    double Withdraw() {
        return idbalance[ID] - newamount; 
    }
    double Deposit() {
        return balance + newasdf;
    }
    String datecreated() {
        return day + "/" + month + "/" + year;
    }
}