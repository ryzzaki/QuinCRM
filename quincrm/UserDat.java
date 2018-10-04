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
@Table(name = "userDat", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "UserDat.findAll", query = "SELECT u FROM UserDat u")
    , @NamedQuery(name = "UserDat.findByUserID", query = "SELECT u FROM UserDat u WHERE u.userID = :userID")
    , @NamedQuery(name = "UserDat.findByUserfname", query = "SELECT u FROM UserDat u WHERE u.userfname = :userfname")
    , @NamedQuery(name = "UserDat.findByUserlname", query = "SELECT u FROM UserDat u WHERE u.userlname = :userlname")
    , @NamedQuery(name = "UserDat.findByUsernick", query = "SELECT u FROM UserDat u WHERE u.usernick = :usernick")
    , @NamedQuery(name = "UserDat.findByUserpass", query = "SELECT u FROM UserDat u WHERE u.userpass = :userpass")})
public class UserDat implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userID", nullable = false)
    private Integer userID;
    @Column(name = "USERFNAME", length = 50)
    private String userfname;
    @Column(name = "USERLNAME", length = 50)
    private String userlname;
    @Column(name = "USERNICK", length = 20)
    private String usernick;
    @Column(name = "USERPASS", length = 30)
    private String userpass;

    public UserDat() {
    }

    public UserDat(Integer userID) {
        this.userID = userID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        Integer oldUserID = this.userID;
        this.userID = userID;
        changeSupport.firePropertyChange("userID", oldUserID, userID);
    }

    public String getUserfname() {
        return userfname;
    }

    public void setUserfname(String userfname) {
        String oldUserfname = this.userfname;
        this.userfname = userfname;
        changeSupport.firePropertyChange("userfname", oldUserfname, userfname);
    }

    public String getUserlname() {
        return userlname;
    }

    public void setUserlname(String userlname) {
        String oldUserlname = this.userlname;
        this.userlname = userlname;
        changeSupport.firePropertyChange("userlname", oldUserlname, userlname);
    }

    public String getUsernick() {
        return usernick;
    }

    public void setUsernick(String usernick) {
        String oldUsernick = this.usernick;
        this.usernick = usernick;
        changeSupport.firePropertyChange("usernick", oldUsernick, usernick);
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        String oldUserpass = this.userpass;
        this.userpass = userpass;
        changeSupport.firePropertyChange("userpass", oldUserpass, userpass);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userID != null ? userID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserDat)) {
            return false;
        }
        UserDat other = (UserDat) object;
        if ((this.userID == null && other.userID != null) || (this.userID != null && !this.userID.equals(other.userID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "quincrm.UserDat[ userID=" + userID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
