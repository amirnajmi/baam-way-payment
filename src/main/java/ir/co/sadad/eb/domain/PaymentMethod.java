package ir.co.sadad.eb.domain;

public enum PaymentMethod {

    INTER_ACCOUNTS(1,"بین حسابهای خود"),
    INTRA_BANK(2,"درون بانکی"),
    SATNA(3,"ساتنا"),
    PAYA(4,"پایا"),
    NONE(5,"نامشخص");

    private Integer code;
    private String title;

    PaymentMethod(Integer code , String title) {
        this.title = title;
        this.code = code;
    }

    public static PaymentMethod getEnum(String str){
        if(str.equals("INTER_ACCOUNTS")){
            return INTER_ACCOUNTS;
        }
        if(str.equals("INTRA_BANK")){
            return INTRA_BANK;
        }
        if(str.equals("SATNA")){
            return SATNA;
        }
        if(str.equals("PAYA")){
            return PAYA;
        }
        return NONE;
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
