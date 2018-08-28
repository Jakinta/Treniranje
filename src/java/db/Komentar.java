
package db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "komentar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Komentar.findAll", query = "SELECT k FROM Komentar k")})
public class Komentar implements Serializable {

    

   

    @Column(name = "kom_ocena")
    private Short komOcena;
   

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kom_id")
    private Integer komId;
    @Size(max = 45)
    @Column(name = "kom_tekst")
    private String komTekst;
    @Column(name = "kom_datum")
    @Temporal(TemporalType.DATE)
    private Date komDatum;
    @JoinColumn(name = "prv_id", referencedColumnName = "prv_id")
    @ManyToOne(optional = false)
    private ProgramVezbanjaAb0 prvId;
    @JoinColumn(name = "pos_id", referencedColumnName = "pos_id")
    @ManyToOne(optional = false)
    private Posetilac posId;

    public Komentar() {
    }

    public Komentar(Integer komId) {
        this.komId = komId;
    }

    public Integer getKomId() {
        return komId;
    }

    public void setKomId(Integer komId) {
        this.komId = komId;
    }

    public String getKomTekst() {
        return komTekst;
    }

    public void setKomTekst(String komTekst) {
        this.komTekst = komTekst;
    }

   

    public Date getKomDatum() {
        return komDatum;
    }

    public void setKomDatum(Date komDatum) {
        this.komDatum = komDatum;
    }

    public ProgramVezbanjaAb0 getPrvId() {
        return prvId;
    }

    public void setPrvId(ProgramVezbanjaAb0 prvId) {
        this.prvId = prvId;
    }

    public Posetilac getPosId() {
        return posId;
    }

    public void setPosId(Posetilac posId) {
        this.posId = posId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (komId != null ? komId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Komentar)) {
            return false;
        }
        Komentar other = (Komentar) object;
        if ((this.komId == null && other.komId != null) || (this.komId != null && !this.komId.equals(other.komId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.Komentar[ komId=" + komId + " ]";
    }

    public Short getKomOcena() {
        return komOcena;
    }

    public void setKomOcena(Short komOcena) {
        this.komOcena = komOcena;
    }



  

  

   
}
