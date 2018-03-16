public class ContaPagar extends Conta {

    Fornecedor fornecedor;

    public ContaPagar(Fornecedor fornecedor, SituacaoConta situacaoConta, String descricao, double valor, String dataVencimento ) {
        super( situacaoConta, descricao, valor, dataVencimento );
        this.fornecedor = fornecedor;
    }

    public void metodoPagar(){
        if (this.valor > 500){
        this.situacaoConta = SituacaoConta.PAGO;
        this.valor = valor;}
        else {
            this.situacaoConta = SituacaoConta.CANCELADA;
            System.out.println( "Valor para pagamento não permitido é permitido: " + this.valor + " favor verificar valor a ser pago" );
            throw new IllegalArgumentException( "Valor não permitido" );
        }

    }


}
