public enum SituacaoConta {

    PENDENTE("pendente"), PAGO("pago"), CANCELADA("cancelada");

    private String nome;

    private SituacaoConta(String nome) {
        this.nome = nome;
    }
}
