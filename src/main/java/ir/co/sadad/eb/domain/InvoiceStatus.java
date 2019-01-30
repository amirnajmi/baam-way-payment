package ir.co.sadad.eb.domain;

public enum InvoiceStatus {

    REGISTERED(1,"ثبت شده"),
    PAYING(2,"در حال پرداخت"),
    CLEARED(3,"تسویه شده"),
    NONE(4,"")
    ;


    private Integer code;
    private String title;

    public Integer getValue() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    InvoiceStatus(Integer code ,String title) {
        this.code = code;
        this.title= title;
    }

    public static InvoiceStatus getEnum(Integer val) {
        if (val == 1) {
            return REGISTERED;
        } else if (val == 2) {
            return PAYING;
        } else if (val == 3) {
            return CLEARED;
        } else {
            return NONE;
        }
    }
}
