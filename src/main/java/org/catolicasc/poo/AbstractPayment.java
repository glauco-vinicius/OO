package org.catolicasc.poo;
public abstract class AbstractPayment  implements  PaymentType{
    protected static final String PAGAMENTO_VALIDO = "Pagamento processado";
    protected static final String PAGAMENTO_NAO_VALIDO = "Pagamento não foi processado";
    protected boolean validPayment = false;
    protected String mensagem = PAGAMENTO_NAO_VALIDO;
    @Override
    public boolean isValid() {
        return validPayment;
    };
    public String getMessage() {
        return mensagem;
    }
}
