package com.company;


public class Payment {
    double productPrice;

    Payment(double productPrice) {
        this();
        this.productPrice = productPrice;
    }

    Payment() {
        System.out.println("A " + this.transactionType() + " transaction is starting.");
    }

    void saleInfo() {
        System.out.println("The product price for this transaction is: " + this.productPrice);
    }

    String transactionType() {
        return null;
    }

    private static class CreditCard extends Payment {
        double remainingCreditCardLim;

        CreditCard(double creditCardLim, double price) {
            super(price);
            this.remainingCreditCardLim = creditCardLim - price;
        }

        void saleInfo() {
            super.saleInfo();
            System.out.println("The remaining credit card limit after sale is: " + this.remainingCreditCardLim);
        }

        String transactionType() {
            return "credit card";
        }
    }

    private static class Cash extends Payment {
        double change;

        Cash(double cashAmount, double price) {
            super(price);
            this.change = cashAmount - price;
        }

        void saleInfo() {
            super.saleInfo();
            System.out.println("The change for this sale is: " + this.change);
        }

        String transactionType() {
            return "cash";
        }
    }

    public static void main(String[] args) {
        Payment creditCardTransaction = new CreditCard(600, 250);
        creditCardTransaction.saleInfo();

        Payment cashTransaction = new Cash(320, 120);
        cashTransaction.saleInfo();
    }
}