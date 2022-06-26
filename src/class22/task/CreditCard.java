package class22.task;

public class CreditCard {
    //1.	Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    double balance;
    double interest;
    public CreditCard(double balance, double interest) {

        this.balance = balance;
        this.interest = interest;
    }


    public void interest(double balance){
//principal x rate of interest x time period divided by 100” or (P x Rx T/100)
        System.out.println("Interest rate of credit card is: "+(interest * balance)/100);

    }
}
//•	Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//•	Call the method by creating an object of each of the three classes
class Visa extends CreditCard {
    public Visa(double balance, double interest) {
        super(balance,interest);
    }
}
class AX extends CreditCard{
    public AX(double balance,double interest) {
        super(balance,interest);
    }

    public void interest(double balance){
        System.out.println("Interest rate of credit card is: "+(interest * balance)/100);
    }
}
class TestCredit {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(20000, 2.5);
        creditCard.interest(20000);

            AX ax = new AX(20000, 2);
            ax.interest(20000);

        Visa visa = new Visa(20000, 3);
        visa.interest(20000);
    }
}