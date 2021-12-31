
public class AlunoObserver extends Observer {

    public AlunoObserver() {
    }

    /**
     * Construtor que registra a classe para ficar observando um assunto
     * 
     * @param assunto
     */
    public AlunoObserver(Assunto assunto) {
        this.assunto = assunto;
        this.assunto.RegistrarObserver(this);
    }

    @Override
    public void Atualizar() {
        enviarEmail();
        atualizarPercentualAtividadesConcluidas();
    }

    private void enviarEmail() {
        System.out.println("Email enviado ao aluno com a cópia do trabalho!");
    }

    private void atualizarPercentualAtividadesConcluidas() {
        System.out.println("O aluno concluíu x% das atividades do período!");
    }
}
