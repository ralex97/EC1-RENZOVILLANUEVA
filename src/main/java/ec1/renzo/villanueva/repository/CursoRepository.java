package ec1.renzo.villanueva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec1.renzo.villanueva.models.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso,Integer> {
  
}
