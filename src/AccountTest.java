import java.util.Scanner;
class Account{
    private String _name;
    private double _balance;

    public String getName(){
        return _name;
    }
    public void setName(String name){
        this._name = name;
    }

    public Account(double balance) {
        if (balance > 0.0) {
            this._balance = balance;
        }
    }

    public void deposit(double depositAmount){
        if(depositAmount>0.0)
            this._balance = this._balance + depositAmount;
    }

    public double getBalance(){
        return this._balance;
    }

}

public class AccountTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Account obj1 = new Account(50.05);
        Account obj2 = new Account(-1.5);
        obj1.setName("Manmehak");
        obj2.setName("Pankaj");

        System.out.printf("%s Balance : %.2f \n", obj1.getName(), obj1.getBalance());
        System.out.printf("%s Balance : %.2f \n", obj2.getName(), obj2.getBalance());

        System.out.printf("Enter amount to deposit in %s Account : ", obj1.getName());
        double deposit1= s.nextDouble();
        System.out.printf("Adding %.2f in %s Account ... \n", deposit1, obj1.getName());
        obj1.deposit(deposit1);

        System.out.printf("%s Balance : %.2f \n", obj1.getName(), obj1.getBalance());

        System.out.printf("Enter amount to deposit in %s Account : ", obj2.getName());
        double deposit2= s.nextDouble();
        System.out.printf("Adding %.2f in %s Account ...\n", deposit2, obj2.getName());
        obj2.deposit(deposit2);

        System.out.printf("%s Balance : %.2f \n", obj2.getName(), obj2.getBalance());







    }
}
