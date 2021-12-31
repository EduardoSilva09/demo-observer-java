
public class Trabalho extends Assunto {

    private String trabalho;

    public Trabalho(String trabalho) {
        this.setTrabalho(trabalho);
    }

    public String getTrabalho() {
        return trabalho;
    }

    private void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public void enviarTrabalho() {
        /* processa o método normalmente */
        System.out.println("Trabalho enviado!");
        /* Notifica os observadores */
        this.NotificarObservers();
    }
}
