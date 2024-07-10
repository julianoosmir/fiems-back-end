package prova.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import prova.entities.Registro;

@ApplicationScoped
public class RegistroRepository implements PanacheRepository<Registro> {
}
