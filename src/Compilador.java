package src;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.Timer;
import compilerTools.Directory;
import compilerTools.ErrorLSSL;
import compilerTools.Production;
import compilerTools.TextColor;
import compilerTools.Token;

public class Compilador {
    private String title;
    private Directory directorio; //creo que no se va a usar
    private ArrayList<Token> tokens; //lista de tokens para el lexico
    private ArrayList<ErrorLSSL> errors; //lista de errores encontrados
    private ArrayList<TextColor> textColors; //para darle color a las palabras reservadas
    private Timer timerKeyReleased;
    private ArrayList<Production> idenProd; 
    private HashMap<String, String> identificadores;
    private boolean compiledSuccess = false;

    public Compilador() {
        initComponents();
        init();
    }

    private void init() {
        title = "C en Español";
        
    }

}
