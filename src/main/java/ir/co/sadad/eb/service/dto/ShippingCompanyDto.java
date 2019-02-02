package ir.co.sadad.eb.service.dto;



import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.persistence.GenerationType;
import java.io.Serializable;

@Schema(name = "ShippingCompanyDto", description = "شرکت حمل و نقل")
public class ShippingCompanyDto implements Serializable {
    @Schema(example = "0", description = "شناسه" )
    private Integer id;
    @Schema(required = true ,example = "شرکت حمل و نقل آبادان", description = "نام شرکت حمل" )
    private String name;
    @Schema(required = true ,example = "1", description = "شناسه" )
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
