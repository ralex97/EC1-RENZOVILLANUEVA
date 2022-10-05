package ec1.renzo.villanueva.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ec1.renzo.villanueva.models.MallaCurricular;
import ec1.renzo.villanueva.services.MallaCurricularService;

@RestController
@RequestMapping("/malla/v1")
public class MallaCurricularController {

  @Autowired
  private MallaCurricularService service;

  @RequestMapping(path = "/listar", method = RequestMethod.GET)
  public ResponseEntity<List<MallaCurricular>> listar() {
    return new ResponseEntity<List<MallaCurricular>>(service.listar(), HttpStatus.OK);
  }

  @RequestMapping(path = "/guardar", method = RequestMethod.POST)
  public ResponseEntity<Void> guardar(@RequestBody MallaCurricular malla) {
    service.guardar(malla);
    return new ResponseEntity<Void>(HttpStatus.CREATED);
  }

  @RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
  public ResponseEntity<MallaCurricular> obtenerPorId(@PathVariable Integer id) {

    MallaCurricular malla = service.obtener(id);

    if (malla != null) {
      return new ResponseEntity<MallaCurricular>(malla, HttpStatus.OK);
    } else {
      return new ResponseEntity<MallaCurricular>(HttpStatus.NOT_FOUND);
    }

  }

  @RequestMapping(path = "/editar", method = RequestMethod.PUT)
  public ResponseEntity<Void> editar(@RequestBody MallaCurricular malla) {

    MallaCurricular mallaObj = service.obtener(malla.getIdMalla());

    if (mallaObj != null) {
      service.actualizar(malla);
      return new ResponseEntity<Void>(HttpStatus.OK);
    } else {
      return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }

  }

  @RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<Void> eliminar(@PathVariable Integer id) {

    MallaCurricular curso = service.obtener(id);

    if (curso != null) {
      service.eliminar(id);
      return new ResponseEntity<Void>(HttpStatus.OK);
    } else {
      return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }
  }

}
