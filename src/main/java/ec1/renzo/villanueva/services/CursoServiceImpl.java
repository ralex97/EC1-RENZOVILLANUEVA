package ec1.renzo.villanueva.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec1.renzo.villanueva.models.Curso;
import ec1.renzo.villanueva.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {

  @Autowired
  private CursoRepository repository;

  @Override
  public List<Curso> listar() {
    return repository.findAll();
  }

  @Override
  public Curso obtener(Integer id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public void guardar(Curso curso) {
    repository.save(curso);
  }

  @Override
  public void actualizar(Curso curso) {
    repository.saveAndFlush(curso);
  }

  @Override
  public void eliminar(Integer id) {
    repository.deleteById(id);
  }
  
}
