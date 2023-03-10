package org.catolicasc.poo;

public class InvalidPaymentType extends AbstractPayment {
    @Override
    public String getName() {
        this.validPayment = false;
        this.mensagem = PAGAMENTO_NAO_VALIDO;
        return "Pagamento Inválido";
    }
}
