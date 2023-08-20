public class ProdutoTeste {
    public static void main(String[] args) {
        Produtos p1 = new Produtos();
        var p2 = new Produtos();

        p1.nome = "Produto1";
        p1.preco = 4000;

        p2.nome = "Produto2";
        p2.preco = 2000;  

        System.out.println("Novo Desconto !");
        Produtos.escolheValorDeDesconto();
    
        System.out.printf("%s com preco inicial de %.2f agora o preco com desconto de %.2f%% = %.2f \n",p1.nome,p1.preco,Produtos.desconto*100,p1.precoComDesconto());
        System.out.printf("%s com preco inicial de %.2f agora o preco com desconto de %.2f%% = %.2f \n",p2.nome,p2.preco,Produtos.desconto*100,p2.precoComDesconto());


    }
}
