package ir.co.sadad.eb.service.dto;



import javax.persistence.GenerationType;
import java.io.Serializable;


public class ShippingCompanyDto implements Serializable {

    private Integer id;
    private String name;
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
