package org.catolicasc.poo;

import java.util.HashMap;
import java.util.Scanner;

class PaymentTypeSelector {
    private Scanner scanner;

    public PaymentTypeSelector() {
        scanner = new Scanner(System.in);
    }

    public PaymentType selectPaymentType() {
        System.out.println("Digite o tipo de pagamento:");
        System.out.println("1. Pix");
        System.out.println("2. Crédito");
        System.out.println("3. Boleto");
        int option = scanner.nextInt();

        HashMap<Integer, PaymentType> paymentMap = new HashMap<>();
        paymentMap.put(1, new PixPaymentType());
        paymentMap.put(2, new CreditoPaymentType());
        paymentMap.put(3, new BoletoPaymentType());

        PaymentType payment = paymentMap.getOrDefault(option, new InvalidPaymentType());
        return payment;
    }
}