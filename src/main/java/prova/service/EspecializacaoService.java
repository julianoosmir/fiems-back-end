package prova.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import prova.entities.Especializacao;
import prova.repository.EspecializacaoRepository;

import java.util.List;

@ApplicationScoped
public class EspecializacaoService {

    @Inject
    private EspecializacaoRepository especializacaoRepository;

    public List<Especializacao> listar() {
        return especializacaoRepository.listAll();
    }
}
