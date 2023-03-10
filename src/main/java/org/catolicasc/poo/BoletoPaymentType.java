package org.catolicasc.poo;

public class BoletoPaymentType extends AbstractPayment {
        @Override
        public String getName() {
            this.validPayment = true;
            this.mensagem = PAGAMENTO_VALIDO;
            return "Boleto";
        }
}

