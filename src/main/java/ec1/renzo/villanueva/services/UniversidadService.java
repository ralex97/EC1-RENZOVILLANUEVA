package ec1.renzo.villanueva.services;

import java.util.List;

import ec1.renzo.villanueva.models.Universidad;

public interface UniversidadService {
  List<Universidad> listar();
	Universidad obtener(Integer id);
  void guardar(Universidad universidad);
	void actualizar(Universidad universidad);
	void eliminar(Integer id);
}
