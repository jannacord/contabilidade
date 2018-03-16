public class Principal {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        Cliente cliente = new Cliente();

        fornecedor.setNome( "Fini Balas e Doces" );
        cliente.setNome( "Tudo Lanchonete e Doceria" );


        //Contas a Pagar...
        ContaPagar contaPagar = new ContaPagar( fornecedor, SituacaoConta.PENDENTE, "Fornecedor de Balas", 9000, "02040218" );
        contaPagar.metodoPagar();
        contaPagar.Cancelar();



        //Contas a Receber...
        ContaReceber contaReceber = new ContaReceber( cliente, SituacaoConta.PENDENTE, "Cliente X a receber" , 99900, "30042018" );
        contaReceber.metodoReceber();
        contaReceber.Cancelar();



        System.out.println( "Fornecedor: " + contaPagar.fornecedor.getNome() + " Situação Finaceira " + contaPagar.situacaoConta + "  Valor : " + contaPagar.valor + " Vencimento: " + contaPagar.dataVencimento );
        System.out.println( "Cliente: " + contaReceber.cliente.getNome() + " Situação Finaceira " + contaReceber.situacaoConta + "  Valor : " + contaReceber.valor + " Vencimento: " + contaReceber.dataVencimento );


    }


}
