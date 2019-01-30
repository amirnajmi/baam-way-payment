package ir.co.sadad.eb.domain;

import lombok.Data;
import org.apache.deltaspike.data.api.audit.CreatedOn;

import javax.persistence.*;

@Entity
@Table(name = "SHIPPING_COMPANY", schema = "PUSH")
public class ShippingCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "100")
    @Column(name = "COMPANY_CODE")
    private String companyCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
}
