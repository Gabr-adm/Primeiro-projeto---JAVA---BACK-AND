package classe;

public class DataTeste {

    public static void main(String[] args) {

        Data dt1 = new Data();
        dt1.dia = 25;
        dt1.mes = 12;
        dt1.ano = 2026;

        var dt2 = new Data();
        dt2.dia = 2;
        dt2.mes = 10;
        dt2.ano = 2023;

        System.out.printf(" %d/%d/%d " ,  dt2.dia , dt2.mes , dt2.ano);
    }
}
