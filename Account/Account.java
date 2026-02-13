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
    double d = 0;
    int answer = 0;
    Double nfg = 0.0;


    Account() {
        ID = 0;
        balance =0;
        annualinterestrate = 0;
        datecreated = currentDate;
    }

    Account(int newID, double newbalance, double newintrest, double withdraw, double deposit, double newdate, int jh) {
        ID = newID;
        newamount = 0;
        balance = newbalance;
        annualinterestrate = newintrest;
        newamount = withdraw;
        newasdf = deposit;
        days = newdate;
        answer = jh;
        
        double[] idbalance = new double[100];
        for (int q = 0; q <= 9; q++) {
            
            idbalance[q] = 100;
            
        }
        d = idbalance[ID];
        
        
    }
    double normal() {
        return Deposit();
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
        return d - newamount; 
    }
    double Deposit() {
        return d + newasdf;
    }
    String datecreated() {
        return day + "/" + month + "/" + year;
    }
}