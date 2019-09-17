package br.senac.rn.agenda;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.repository.ContatoRepository;

public class AgendaApplication {

    public static void main(String[] args) {
        ContatoRepository repository = new ContatoRepository();
        for (Contato contato : repository.findAll()) {
            System.out.println(contato.getNome());
        }
    }

}
