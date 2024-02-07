package meucci.tpsit.jpah2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import meucci.tpsit.jpah2.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
    List<Persona> findByName(String name);
}
