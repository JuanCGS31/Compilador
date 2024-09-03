package src;

public class Compilador {
    private String title;
    private Directory directorio;
    private ArrayList<token> tokens; //lista de tokens para el lexico
    private ArrayList<ErrorLSSL> errors; //lista de errores encontrados
    private ArrayList<TextColor> textColors;
    private Timer timerKeyReleased;
    private ArrayList<Production> idenProd;
    private HashMap<String, String> identificadores;
    private boolean compiledSuccess = false;

    public Compilador() {

    }

}
