package prova.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import prova.entities.Casa;
import prova.repository.CasaRepository;

import java.util.List;

@ApplicationScoped
public class CasaService {

    @Inject
    private CasaRepository casaRepository;

    public List<Casa> listaCasas() {
        return casaRepository.listAll();
    }
}
