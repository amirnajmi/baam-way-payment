package ir.co.sadad.eb.service.dto;

public enum PaymentMethodDto {

    INTER_ACCOUNTS("بین حسابهای خود"),
    INTRA_BANK("درون بانکی"),
    SATNA("ساتنا"),
    PAYA("پایا"),
    NONE("نامشخص");

    private String title;

    PaymentMethodDto(String title) {
        this.title = title;
    }

    public static PaymentMethodDto getEnum(String str){
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
