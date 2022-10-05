package ec1.renzo.villanueva.services;

import java.util.List;

import ec1.renzo.villanueva.models.MallaCurricular;

public interface MallaCurricularService {
  List<MallaCurricular> listar();
	MallaCurricular obtener(Integer id);
  void guardar(MallaCurricular mallaCurricular);
	void actualizar(MallaCurricular mallaCurricular);
	void eliminar(Integer id);
}
