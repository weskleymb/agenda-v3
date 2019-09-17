package br.senac.rn.agenda;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.repository.ContatoRepository;

public class AgendaApplication {

    public static void main(String[] args) {
        Contato caio = new Contato();
        caio.setNome("Caio Castro");
        caio.setFone("97474-5252");

        ContatoRepository repository = new ContatoRepository();
        repository.save(caio);
    }

}
