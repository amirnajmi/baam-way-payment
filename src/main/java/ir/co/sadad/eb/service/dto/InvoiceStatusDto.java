package ir.co.sadad.eb.service.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name = "InvoiceStatusDto", description = "وضعیت صورتحساب")
public enum InvoiceStatusDto {

    REGISTERED(1, "ثبت شده"),
    PAYING(2, "در حال پرداخت"),
    CLEARED(3, "تسویه شده"),
    NONE(4, "");

    @Schema(required = true ,example = "1", description = "کد" )
    private Integer code;
    @Schema(required = true ,example = "ثبت شده", description = "صورت وضعیت" )
    private String title;

    public Integer getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    InvoiceStatusDto(Integer code, String title) {
        this.code = code;
        this.title = title;
    }

}
