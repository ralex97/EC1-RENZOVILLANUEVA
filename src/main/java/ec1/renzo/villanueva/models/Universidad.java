package ec1.renzo.villanueva.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "universidad")
public class Universidad {
  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idUniversidad;
  private String universidad;

  @OneToOne
  private MallaCurricular mallaCurricular;

  public Integer getIdUniversidad() {
    return idUniversidad;
  }
  public void setIdUniversidad(Integer idUniversidad) {
    this.idUniversidad = idUniversidad;
  }
  public String getUniversidad() {
    return universidad;
  }
  public void setUniversidad(String universidad) {
    this.universidad = universidad;
  }

  
}
