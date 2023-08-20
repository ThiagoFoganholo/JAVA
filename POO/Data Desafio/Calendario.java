public class Calendario {
    
    int dia;
    int mes;
    int ano;

    Calendario(){   
        dia = 1;
        mes = 3;
        ano = 1970;
    }

    Calendario(int diaInicia, int mesInicial, int anoInicial){
        dia = diaInicia;
        mes = mesInicial;
        ano = anoInicial;
    }

    String formataData(int diaInicia, int mesInicial, int anoInicial){
        return String.format("%d/%d/%d",dia,mes,ano);
    }
    void exibirDataFormatada(){
        System.out.println(formataData(dia, mes, ano));
    }
}
