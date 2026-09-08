package Roadpmap.ClassesAnonimas;

public class Externa {

    private String text = "oi";

    public class interno{

        private String text = "tchau";

        public void imprimir(){
            System.out.println(text);
            System.out.println(Externa.this.text);

        }
    }
}


