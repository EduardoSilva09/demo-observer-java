public class MainTest {
    public static void main(String[] args) {
        /* Objeto que será observado */
        Trabalho trabalho = new Trabalho("Trabalho de Padrão de projetos");

        /* Observadores */
        new AlunoObserver(trabalho);
        new ProfessorObserver(trabalho);

        /* Quando o trabalho for enviado ele irá notificar os observadores */
        trabalho.enviarTrabalho();
    }
}