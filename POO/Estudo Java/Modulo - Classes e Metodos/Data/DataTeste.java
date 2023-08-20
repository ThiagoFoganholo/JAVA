
public class DataTeste {
    public static void main(String[] args) {
        
        Data d1 = new Data();
        Data d2 = new Data(03,04,2019);

        System.out.println(d1.formataData(0, 0, 0));
        d2.exibirDataFormatada();

        d2.ano = 10000;
        d1.mes = 400000;

         d2.exibirDataFormatada();
         d1.exibirDataFormatada();


    }
}
