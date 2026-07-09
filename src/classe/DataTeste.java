package classe;

public class DataTeste {

    public static void main(String[] args) {

        Data dt1 = new Data();

        var dt2 = new Data(2, 10, 2023);


        String formatacao1 = dt1.obterFormataçãoData();
        String formatacao2 = dt2.obterFormataçãoData();
        String resultado = (formatacao1 + formatacao2);

        System.out.println(resultado);
    }
}
