package prova.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import prova.entities.Registro;
import prova.repository.RegistroRepository;

import java.util.List;

@ApplicationScoped
public class RegistroService {

    @Inject
    private RegistroRepository registroRepository;

    @Transactional
    public void registrar(Registro registro) {
       this.registroRepository.persist(registro);
    }

    public List<Registro> listar() {
        return registroRepository.listAll();
    }

}
