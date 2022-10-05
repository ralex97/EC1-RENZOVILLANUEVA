package ec1.renzo.villanueva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec1.renzo.villanueva.models.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor,Integer>{
  
}
