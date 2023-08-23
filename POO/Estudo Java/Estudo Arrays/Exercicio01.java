package Array.Exercicios;
import java.util.Arrays;

public class Exercicio01 {

    public static void main(String[] args) {
        double [] notasAlunos = new double[4];
        notasAlunos[0] = 7.9;
        notasAlunos[1] = 8.0;
        notasAlunos[2] = 6.7;
        notasAlunos[3] = 5.7;

        String resultado = Arrays.toString(notasAlunos);
        System.out.println(resultado + "\n");

        double total = 0;

        for(int i = 0 ; i< notasAlunos.length; i++){
            total += notasAlunos[i];
            System.out.println(notasAlunos[i]);
        }
        System.out.printf("A media = %.2f",total/notasAlunos.length);
    }
}
