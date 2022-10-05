package ec1.renzo.villanueva.services;

import java.util.List;

import ec1.renzo.villanueva.models.Curso;

public interface CursoService {
	List<Curso> listar();
	Curso obtener(Integer id);
  void guardar(Curso curso);
	void actualizar(Curso curso);
	void eliminar(Integer id);
}
