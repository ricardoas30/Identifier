package br.edu.utfpr.identifier;

/**
 *
 * @author Ricardo A. Silveira
 * Disciplina: Teste de Software | Teste de Unidade 2
 */
public class Identifier {
    String ID = "";

    public static void main(String[] args) {
        new Identifier();
    }

    public Identifier() {
        Inicio();
    }
    
    public void Inicio() {
    }
    
    public String Identificador(String ID) {
        String resp = "Invalido";
        
        if(valida_caracter_nulo(ID) == false) {
            throw new NullPointerException("Não é permitido identificador com valores nulos !");
        }
        
        
        if(valida_caracter_nulo(ID) == true) {
            
            if(ID.matches("[a-zA-Z][a-zA-Z][a-zA-Z][0-9]+{1,6}") == true){
                resp = "Valido";
            }
        }
        return resp;
    }

    public boolean valida_caracter_nulo(String ID) {
        boolean resp = false;
        
        if(String.valueOf(ID.length()) != null) {
            resp = true;
        }
        
        return resp;
    }
}
