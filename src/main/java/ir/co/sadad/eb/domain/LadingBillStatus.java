package ir.co.sadad.eb.domain;

public enum LadingBillStatus {

    INITIAL_REGISTRATION(1, "ثبت اولیه"),
    CARGO_DELIVERED(2, "تحویل کالا به انبار"),
    CONTRIBUTIONS_DETERMINED(3, "سهم ها مشخص شد"),
    TO_BE_PAID(4, "در حال پرداخت"),
    PAID(5, "پرداخت شده"),
    UNSUCCESSFUL_PAYMENT(6, "پرداخت ناموفق"),
    NONE(7, "نامشخص");

    private Integer code;
    private String title;

    LadingBillStatus(Integer code, String title) {
        this.code = code;
        this.title = title;
    }

    public static LadingBillStatus getEnum(Integer code) {
        switch (code) {
            case 1:
                return INITIAL_REGISTRATION;
            case 2:
                return CARGO_DELIVERED;
            case 3:
                return CONTRIBUTIONS_DETERMINED;
            case 4:
                return TO_BE_PAID;
            case 5:
                return PAID;
            case 6:
                return UNSUCCESSFUL_PAYMENT;
            default:
                return NONE;
        }
    }

    public static LadingBillStatus getEnum(String title) {
        switch (title) {
            case "INITIAL_REGISTRATION":
                return INITIAL_REGISTRATION;
            case "CARGO_DELIVERED":
                return CARGO_DELIVERED;
            case "CONTRIBUTIONS_DETERMINED":
                return CONTRIBUTIONS_DETERMINED;
            case "TO_BE_PAID":
                return TO_BE_PAID;
            case "PAID":
                return PAID;
            case "UNSUCCESSFUL_PAYMENT":
                return UNSUCCESSFUL_PAYMENT;
            default:
                return NONE;
        }
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
