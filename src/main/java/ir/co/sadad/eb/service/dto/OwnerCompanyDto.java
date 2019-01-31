package ir.co.sadad.eb.service.dto;

import java.io.Serializable;

public class OwnerCompanyDto implements Serializable {

    private Integer id;
    private String name;
    private String legalNo;

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

    public String getLegalNo() {
        return legalNo;
    }

    public void setLegalNo(String legalNo) {
        this.legalNo = legalNo;
    }
}
