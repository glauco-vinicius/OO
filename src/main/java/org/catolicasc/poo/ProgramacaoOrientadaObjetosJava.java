package org.catolicasc.poo;
public class ProgramacaoOrientadaObjetosJava {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        double valor = inputReader.readDouble("Qual o valor?");
        PaymentTypeSelector paymentTypeSelector = new PaymentTypeSelector();
        PaymentType paymentType = paymentTypeSelector.selectPaymentType();
        System.out.println("  Opção selecionada: " + paymentType.getName());
        System.out.println("Validacao Pagamento: " + paymentType.getMessage());
    }
}
