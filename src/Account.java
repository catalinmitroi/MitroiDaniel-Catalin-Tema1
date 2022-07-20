public class Account {
    int accountNo;
    int amount;
    String nationalId;

    public Account(int accountNo, int amount, String nationalId) {
        this.accountNo = accountNo;
        this.amount = amount;
        this.nationalId = nationalId;
    }

    public void deposit(int amount) {
        this.amount += amount;
        System.out.println("Total amount: " + this.amount);
    }

    public void withdraw(int amount) throws NotEnoughMoneyException {
        if (this.amount < amount) throw new NotEnoughMoneyException("insufficient funds");

        this.amount -= amount;
        System.out.println("The amount drawn:" + amount);
        System.out.println("The amount remaining after the draw: " + this.amount);
    }

    public void linkToNationalId(String nationalId) throws InvalidNationalIdException {
        if (nationalId.length() != 13)
            throw new InvalidNationalIdException("Invalid nationalId. There are more or less than 13 characters.");
        if (nationalId.charAt(0) == '1' || nationalId.charAt(0) == '2') {
            if (nationalId.charAt(1) == '4' || nationalId.charAt(1) == '5' || nationalId.charAt(1) == '6' || nationalId.charAt(1) == '7' || nationalId.charAt(1) == '8' || nationalId.charAt(1) == '9') {
                if (nationalId.charAt(3) == '0') {
                    if (nationalId.equals(this.nationalId)) {
                        System.out.println("National Id: " + nationalId);
                        System.out.println("No Account: " + this.accountNo);
                        System.out.println("The amount: " + this.amount);
                    } else {
                        throw new InvalidNationalIdException("Invalid nationalId. Doesn't exist.");
                    }
                } else if (nationalId.charAt(3) == '1' && (nationalId.charAt(4) == '1' || nationalId.charAt(4) == '2')) {
                    if (nationalId.equals(this.nationalId)) {
                        System.out.println("National Id: " + nationalId);
                        System.out.println("No Account: " + this.accountNo);
                        System.out.println("The amount: " + this.amount);
                    } else {
                        throw new InvalidNationalIdException("Invalid nationalId. Doesn't exist.");
                    }
                } else {
                    throw new InvalidNationalIdException("Invalid nationalId. Some characters are wrong.");
                }
            }
        } else if (nationalId.charAt(0) == '5' || nationalId.charAt(0) == '6') {
            if (nationalId.charAt(1) == '0' || nationalId.charAt(1) == '1' || nationalId.charAt(1) == '2') {
                if (nationalId.charAt(3) == '0') {
                    if (nationalId.equals(this.nationalId)) {
                        System.out.println("National Id: " + nationalId);
                        System.out.println("No Account: " + this.accountNo);
                        System.out.println("The amount: " + this.amount);
                    } else {
                        throw new InvalidNationalIdException("Invalid nationalId. Doesn't exist.");
                    }
                } else if (nationalId.charAt(3) == '1' && (nationalId.charAt(4) == '1' || nationalId.charAt(4) == '2')) {
                    if (nationalId.equals(this.nationalId)) {
                        System.out.println("National Id: " + nationalId);
                        System.out.println("No Account: " + this.accountNo);
                        System.out.println("The amount: " + this.amount);
                    } else {
                        throw new InvalidNationalIdException("Invalid nationalId. Doesn't exist.");
                    }
                } else {
                    throw new InvalidNationalIdException("Invalid nationalId. Some characters are wrong.");
                }
            }
        } else {
            throw new InvalidNationalIdException("Invalid nationalId. Some characters are wrong.");
        }
    }
}
