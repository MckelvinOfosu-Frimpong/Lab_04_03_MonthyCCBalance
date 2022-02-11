public class Main {

    public static void main(String[] args)
    {
	int balance = 5000;
    double interestRate = 1.17;
    double balancePlusInterest = balance * interestRate;

        System.out.println("Your balance without interest is " + balance);
        System.out.println("The interest rate is 17%");
        System.out.println("your first month's interest is " + balancePlusInterest);
        System.out.println("Your second month's interest is " + balancePlusInterest * interestRate);
    }
}
