
public class DataTeste {
    public static void main(String[] args) {
        
        Calendario d1 = new Calendario();
        Calendario d2 = new Calendario(03,04,2019);

        System.out.println(d1.formataData(0, 0, 0));
        d2.exibirDataFormatada();

        d2.ano = 10000;
        d1.mes = 400000;

         d2.exibirDataFormatada();
         d1.exibirDataFormatada();


    }
}
