package ec1.renzo.villanueva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec1.renzo.villanueva.models.MallaCurricular;

@Repository
public interface MallaCurricularRepository extends JpaRepository<MallaCurricular,Integer> {
  
}
