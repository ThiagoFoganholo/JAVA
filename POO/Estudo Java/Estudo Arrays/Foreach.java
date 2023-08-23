package Array.Exercicios;

public class Foreach {
    
    public static void main(String[] args) {
        double[] numeros = {0, 1, 2, 3, 4};
        int i = 0;
        for (double numero : numeros) {
            System.out.printf("%d) %.5f \n",i,numero);
            i++;
        }
    }
}
