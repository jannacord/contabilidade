public abstract class Conta {

    SituacaoConta situacaoConta;
    String descricao;
    double valor;
    String dataVencimento;

    public Conta(SituacaoConta situacaoConta, String descricao, double valor, String dataVencimento) {
        this.situacaoConta = situacaoConta;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public Conta() {
    }

    public void Cancelar() {

    }


}
