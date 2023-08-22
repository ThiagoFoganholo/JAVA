public class Jantar {
    public static void main(String[] args) {
        
        Comida comida1 = new Comida();
        Comida comida2 = new Comida();
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Fulano";
        pessoa1.peso = 80.0;

        comida1.nome = "Arroz";
        comida1.peso = 0.2;

        comida2.nome = "Carne";
        comida2.peso = 0.5;
        
        System.out.println("Ola meu nome eh " + pessoa1.nome + " meu peso  total = " + pessoa1.peso + " kg");

        pessoa1.comer(comida1);
        System.out.println("Ola meu nome eh " + pessoa1.nome + " comi "+ comida1.nome + " que pesa "+comida1.peso + " kg ,meu peso  total = " + pessoa1.peso + " kg");

        pessoa1.comer(comida2);
        System.out.println("Ola meu nome eh " + pessoa1.nome + " comi "+ comida2.nome + " que pesa "+comida2.peso + " kg, meu peso  total = " + pessoa1.peso + " kg");

    }
}
