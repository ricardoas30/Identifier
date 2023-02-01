package br.edu.utfpr.test;

import br.edu.utfpr.identifier.Identifier;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 *
 * @author Ricardo A. Silveira
 * Disciplina: Teste de Software | Teste de Unidade 2
 */
public class JUnitTest {
    private Identifier valida;
    
    public JUnitTest() {
        this.valida = new Identifier();
    }
    
    @Test
    public void Teste_01() {
        // Verifica se o identificador é nulo
        assertNotNull(valida.Identificador(null), null);
    }
    @Test
    public void Teste_02() {
        // Verifica um identificador válido
        assertEquals(valida.Identificador("abc12"), "Valido");
    }
    @Test
    public void Teste_03() {
        // Verifica um identificador inválido
        assertEquals(valida.Identificador("cont*1"), "Invalido");
    }
    @Test
    public void Teste_04() {
        // Verifica um identificador inválido
        assertEquals(valida.Identificador("1soma"), "Invalido");
    }
    @Test
    public void Teste_05() {
        // Verifica um identificador inválido
        assertEquals(valida.Identificador("a12346"), "Invalido");
    }
    @Test
    public void Teste_06() {
        // Verifica um identificador Válido
        assertEquals(valida.Identificador("con212"), "Valido");
    }
    @Test
    public void Teste_07() {
        // Verifica um identificador Inválido
        assertEquals(valida.Identificador("Munx54"), "Invalido");
    }
}
