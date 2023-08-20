import java.util.Scanner;

public class Produtos {
    
    String nome;
    double preco;
    static double desconto = 0.25;

    Produtos(){
    }
    Produtos(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }
    double precoComDesconto(){
        return preco * (1 - Produtos.desconto);
    }

    static Scanner scanner = new Scanner(System.in);

    static void escolheValorDeDesconto() {
        Scanner scanner = new Scanner(System.in); // Inicializa o objeto scanner
        System.out.println("Declare um novo desconto entre 0 a 1 : ");
        String valorNovoDoDesconto = scanner.nextLine();
        double descontoDeStringParaDouble = Double.parseDouble(valorNovoDoDesconto);
        desconto = descontoDeStringParaDouble;
        scanner.close(); // Não se esqueça de fechar o scanner quando não for mais necessário
    }
}
