package ec1.renzo.villanueva.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "malla")
public class MallaCurricular {

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idMalla;
  private Date año;

  @OneToOne
	private Universidad universidad;

  @OneToMany(mappedBy = "malla")
	private List<Curso> cursos =new ArrayList<>();

  public Integer getIdMalla() {
    return idMalla;
  }
  public void setIdMalla(Integer idMalla) {
    this.idMalla = idMalla;
  }
  public Date getAño() {
    return año;
  }
  public void setAño(Date año) {
    this.año = año;
  }

  
}
