import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

/**
 * Escolha ColetorDados ou EspecialistaLimpeza e complete 2 testes.
 * Um deles deve obrigatoriamente verificar registrarPagamento.
 */
public class OperadorTest {
    @Test
    void exemploEstruturaAaa() {
        ColetorDados c = new ColetorDados("Ana", "C001");
        double turnos = c.addTurnoExtra(1.0);
        assertEquals(0.0, turnos, 0.001,
                "este exemplo só ilustra AAA; substitua pelos seus 2 testes");
    }

    @Test 
    void testarMaximoDeTurnosColetor(){
        ColetorDados lucca = new ColetorDados ("lucca", "C01");
        double turnos = lucca.addTurnoExtra(45);
        assertEquals(28, turnos, 0.001,
            "Teste de limite máximo = 28"
        );
    }

    @Test 
    void testarPagamentoColetor(){
        ColetorDados lucca = new ColetorDados ("lucca", "C05");
        lucca.addTurnoExtra(5);
        double pagamento = lucca.registrarPagamento();
        assertEquals(3321.428, pagamento, 0.001,
            "Salário equivalente a 5 turnos extras"
        );
    }

    // TODO: criar 2 testes unitários (AAA + mensagem na asserção)
    // TODO: um deles deve testar registrarPagamento
}
