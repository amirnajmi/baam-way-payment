package ir.co.sadad.eb.service.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;

@Schema(name = "OwnerCompanyDto", description = "شرکت صاحب بار")
public class OwnerCompanyDto implements Serializable {

    @Schema(example = "0", description = "شناسه" )
    private Integer id;
    @Schema(required = true ,example = "گروه بازرگانی ایران", description = "نام شرکت صاحب بار" )
    private String name;
    @Schema(required = true ,example = "12345678911", description = "شناسه حقوقی شرکت صاحب بار" )
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
