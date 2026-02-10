class Payment {
    void pay() {
        System.out.println("Processing payment");
    }
}

class CreditCardPayment extends Payment {
    void pay() {
        System.out.println("Payment using Credit Card");
    }
}

class BankTransferPayment extends Payment {
    void pay() {
        System.out.println("Payment using Bank Transfer");
    }
}

class UPIPayment extends Payment {
    void pay() {
        System.out.println("Payment using UPI");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.pay();

        p = new BankTransferPayment();
        p.pay();

        p = new UPIPayment();
        p.pay();
    }
}