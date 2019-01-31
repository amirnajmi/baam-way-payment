package ir.co.sadad.eb.service.dto;

public enum InvoiceStatusDto {

    REGISTERED(1, "ثبت شده"),
    PAYING(2, "در حال پرداخت"),
    CLEARED(3, "تسویه شده"),
    NONE(4, "");


    private Integer code;
    private String title;

    public Integer getValue() {
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
