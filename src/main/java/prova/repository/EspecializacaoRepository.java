package prova.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import prova.entities.Especializacao;

@ApplicationScoped
public class EspecializacaoRepository implements PanacheRepository<Especializacao> {
}
