public class Data {
    
    int dia;
    int mes;
    int ano;

    Data(){   
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1, 1, 1970);
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String formataData(int dia, int mes, int ano){
        return String.format("%d/%d/%d",this.dia,this.mes,this.ano);
    }
    void exibirDataFormatada(){
        System.out.println(this.formataData(this.dia, this.mes, this.ano));
    }
}
