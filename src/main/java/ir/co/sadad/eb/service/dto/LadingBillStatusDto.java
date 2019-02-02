package ir.co.sadad.eb.service.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;
@Schema(name = "LadingBillStatusDto", description = "وضعیت بارنامه")
public enum LadingBillStatusDto implements Serializable {

    INITIAL_REGISTRATION(1, "ثبت اولیه"),
    CARGO_DELIVERED(2, "تحویل کالا به انبار"),
    CONTRIBUTIONS_DETERMINED(3, "سهم ها مشخص شد"),
    TO_BE_PAID(4, "در حال پرداخت"),
    PAID(5, "پرداخت شده"),
    UNSUCCESSFUL_PAYMENT(6, "پرداخت ناموفق");

    @Schema(required = true ,example = "1", description = "کد" )
    private Integer code;
    @Schema(required = true ,example = "ثبت اولیه", description = "صورت وضعیت" )
    private String title;

    LadingBillStatusDto(int i, String s) {
        this.code = code;
        this.title = title;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
