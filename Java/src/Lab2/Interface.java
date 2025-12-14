package Lab2;

interface BankAccount {
    void deposite();
    void withdraw();
    void display();
}

class Saving implements BankAccount {
    @Override
    public void deposite() {
        System.out.println("Depositing in ");

    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing from Saving Account");
    }

    @Override
    public void display() {
        System.out.println("This is Saving Account");
    }
}

class Checking implements BankAccount {
    @Override
    public void deposite() {
        System.out.println("Depositing in Checking Account");

    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing from Checking Account");
    }

    @Override
    public void display() {
        System.out.println("This is Checking Account");
    }
}
