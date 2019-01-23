/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.co.sadad.eb.domain;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author anajmi
 */
@Entity
@Table(name = "STATUS")
@NamedQueries({
    @NamedQuery(name = "Status.findAll", query = "SELECT s FROM Status s")
    , @NamedQuery(name = "Status.findByStatusCode", query = "SELECT s FROM Status s WHERE s.statusCode = :statusCode")
    , @NamedQuery(name = "Status.findByTitle", query = "SELECT s FROM Status s WHERE s.title = :title")})
//@Cacheable
//@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Status implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STATUS_CODE")
    private Short statusCode;
    @Basic(optional = false)
    @Column(name = "TITLE")
    private String title;

    public Status() {
    }

    public Status(Short statusCode) {
        this.statusCode = statusCode;
    }

    public Status(Short statusCode, String title) {
        this.statusCode = statusCode;
        this.title = title;
    }

    public Short getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Short statusCode) {
        this.statusCode = statusCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statusCode != null ? statusCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Status)) {
            return false;
        }
        Status other = (Status) object;
        if ((this.statusCode == null && other.statusCode != null) || (this.statusCode != null && !this.statusCode.equals(other.statusCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.domain.Status[ statusCode=" + statusCode + " ]";
    }
    
}
