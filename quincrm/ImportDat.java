/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quincrm;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author cuong
 */
@Entity
@Table(name = "importDat", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "ImportDat.findAll", query = "SELECT i FROM ImportDat i")
    , @NamedQuery(name = "ImportDat.findByImpID", query = "SELECT i FROM ImportDat i WHERE i.impID = :impID")})
public class ImportDat implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "impID", nullable = false)
    private Integer impID;

    public ImportDat() {
    }

    public ImportDat(Integer impID) {
        this.impID = impID;
    }

    public Integer getImpID() {
        return impID;
    }

    public void setImpID(Integer impID) {
        Integer oldImpID = this.impID;
        this.impID = impID;
        changeSupport.firePropertyChange("impID", oldImpID, impID);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (impID != null ? impID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImportDat)) {
            return false;
        }
        ImportDat other = (ImportDat) object;
        if ((this.impID == null && other.impID != null) || (this.impID != null && !this.impID.equals(other.impID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "quincrm.ImportDat[ impID=" + impID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
