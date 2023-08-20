public class DesafioPrimeiroTrauma {
    int a = 3;
    static int b = 4;
   
    public static void main(String[] args) {
        DesafioPrimeiroTrauma recebeValor = new DesafioPrimeiroTrauma();
        System.out.println(recebeValor.a); // Está acessando a variável de instância a através de uma instância da classe Desafio

        System.out.println(b); // Está acessando a variável estática b diretamente através da classe Desafio
    }
}
