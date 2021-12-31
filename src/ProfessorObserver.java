
public class ProfessorObserver extends Observer {
    
    public ProfessorObserver() {
    }

    /**
     * Construtor que registra um observer, caso chamado deve ser passado um assunto
     * 
     * @param assunto
     */
    public ProfessorObserver(Assunto assunto) {
        this.assunto = assunto;
        /* Registrando esta classe como observadora do assunto que ela recebeu */
        this.assunto.RegistrarObserver(this);
    }

    @Override
    public void Atualizar() {
        enviarEmail();
    }

    public void enviarEmail() {
        System.out.println("Email enviado ao professor informando que o trabalho foi enviado!");
    }

}
