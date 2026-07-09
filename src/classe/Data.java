package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(){
        dia = 01;
        mes = 01;
        ano = 1970;

    }

    Data(int dia, int mes, int ano ){
        this.dia = dia;
        this.mes = mes;
       this.ano = ano;

    }
    Data( String obterDataImpressa){
        return;
    }

    String obterFormataçãoData(){
        return String.format (" %02d/%02d/%d ", dia,  mes,  ano);
    }
}
