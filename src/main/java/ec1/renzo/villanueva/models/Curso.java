package ec1.renzo.villanueva.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {
  
  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idCurso;
  private String nombre;
  private String descripcion;

  @ManyToOne
  @JoinColumn(
			name="id_malla",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_malla) references malla(id_malla)")
	)
  private MallaCurricular malla;

  @ManyToMany(mappedBy = "cursos", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private List<Profesor> profesores = new ArrayList<>();
  
  public Integer getIdCurso() {
    return idCurso;
  }
  public void setIdCurso(Integer idCurso) {
    this.idCurso = idCurso;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  public MallaCurricular getMallaCurricular() {
    return malla;
  }
  public void setMallaCurricular(MallaCurricular malla) {
    this.malla = malla;
  }
  
}
