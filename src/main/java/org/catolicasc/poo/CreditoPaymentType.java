package org.catolicasc.poo;

class CreditoPaymentType extends AbstractPayment {
    @Override
    public String getName() {
        this.validPayment = true;
        this.mensagem = PAGAMENTO_VALIDO;
        return "Crédito";
    }
}
