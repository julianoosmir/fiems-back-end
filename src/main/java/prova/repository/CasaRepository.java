package prova.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import prova.entities.Casa;

@ApplicationScoped
public class CasaRepository implements PanacheRepository<Casa> {
}
