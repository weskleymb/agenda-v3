package br.senac.rn.agenda;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.repository.ContatoRepository;

public class AgendaApplication {

    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Michele Silva");
        contato.setFone("3232-1515");

        ContatoRepository repository = new ContatoRepository();
        repository.save(contato);
    }

}
