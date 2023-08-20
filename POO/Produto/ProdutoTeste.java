public class ProdutoTeste {
    public static void main(String[] args) {
        Produtos p1 = new Produtos();
        var p2 = new Produtos();

        p1.nome = "Produto1";
        p1.preco = 4000;
        p1.desconto = 0.25;

        p2.nome = "Produto2";
        p2.preco = 2000;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double PrecoComDesconto1 = p1.precoComDesconto();
        double PrecoComDesconto2 = p2.precoComDesconto();
        double precoTotal = PrecoComDesconto1+PrecoComDesconto2;

        System.out.printf("%s com preco inicial = R$%.2f, com desconto = R$ %.2f\n",p1.nome,p1.preco,PrecoComDesconto1);
        System.out.printf("%s com preco inicial = R$%.2f, com desconto = R$ %.2f\n",p2.nome,p2.preco,PrecoComDesconto2);
        System.out.printf("Preco total = R$%.2f",precoTotal);



    }
}
