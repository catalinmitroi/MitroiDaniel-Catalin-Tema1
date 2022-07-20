public class Main {
    public static void main(String[] args) throws NotEnoughMoneyException, InvalidNationalIdException {

        Account ac = new Account(1,27,"1990516325468");
        Account ac1 = new Account(2,34,"2791126254357");
        Account ac2 = new Account(3,16,"1970516471805");
        Account ac3 = new Account(4,52,"5020123275468");
        Account ac4 = new Account(5,43,"6190819372467");
        ac.deposit(13);
        ac.withdraw(35);
        ac.deposit(15);
        ac1.deposit(24);
        //ac1.withdraw(60);

        ac.linkToNationalId("1990516325468");
        ac1.linkToNationalId("2791126254357");
        //ac2.linkToNationalId("3970516471805");
        ac3.linkToNationalId("5020123275468");
        ac4.linkToNationalId("2791126543571");

    }
}