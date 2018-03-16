public class ContaReceber extends Conta {

    Cliente cliente;

    public ContaReceber(Cliente cliente, SituacaoConta situacaoConta, String descricao, double valor, String dataVencimento) {
        super( situacaoConta, descricao, valor, dataVencimento );
        this.cliente = cliente;
    }

    public void metodoReceber() {
        if (valor > 5000) {
            this.situacaoConta = SituacaoConta.PAGO;
        }

    }

    public void Cancelar() {
        if (valor < 5000) {
            this.situacaoConta = SituacaoConta.CANCELADA;
            System.out.println( "Valor para pagamento não permitido é permitido: " + this.valor + " favor verificar valor a ser pago" );
            throw new IllegalArgumentException( "Valor não permitido" );
        }
    }
}
