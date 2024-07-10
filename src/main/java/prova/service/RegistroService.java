package prova.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import prova.dto.ResgistroDTO;
import prova.entities.Registro;
import prova.repository.RegistroRepository;

import java.time.LocalDate;
import java.util.List;

@ApplicationScoped
public class RegistroService {

    @Inject
    private RegistroRepository registroRepository;

    @Transactional
    public void registrar(Registro registro) {
        registro.setData(LocalDate.now());
        this.registroRepository.persist(registro);
    }

    public List<Registro> listar() {
        return registroRepository.listAll();
    }

    public List<ResgistroDTO> listarDTO() {
        return registroRepository.listAll().stream()
                .map(registro -> new ResgistroDTO(registro.getId(),registro.getNome(),
                        registro.getTelefone(), registro.getEmail(), registro.getData(), registro.getCasa().getNome(),
                        registro.getEspecializacao().getNome())).toList();
    }

}
