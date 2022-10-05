package ec1.renzo.villanueva.services;

import java.util.List;
import ec1.renzo.villanueva.models.Profesor;

public interface ProfesorService {
  List<Profesor> listar();
	Profesor obtener(Integer id);
  void guardar(Profesor profesor);
	void actualizar(Profesor profesor);
	void eliminar(Integer id);
}
