package ir.co.sadad.eb.service.dto;

public enum PaymentStatusDto {

    RECEIVED("درخواست انتقال دریافت شد"),                                                //درخواست انتقال دریافت شد و منتظر تایید است
    PROCESSING("تراکنش درحال پردازش است"),                                               //تراکنش درحال پردازش است. برای دریافت نتیجه نهایی استعلام شود
    REGISTERED("تراکنش با موفقیت از سمت مبدا ثبت شده و به بانک مقصد ارسال شده است"),     //تراکنش در سامانه بین بانکی با موفقیت از سمت مبدا ثبت شده و به بانک مقصد ارسال شده است
    SUCCEEDED("انتقال موفقیت آمیز بوده است"),                                            //انتقال موفقیت آمیز بوده است
    FAILED("تراکنش ناموفق بوده است"),                                                    //تراکنش ناموفق بوده است
    CONTRADICTION("وضعیت تراکنش دارای مغایرت است"),                                      //وضعیت تراکنش دارای مغایرت است. این حالت معمولا تنها در پاسخ به سرویس استعلام انتقال وجه دریافت میگردد و نیازمند پیگیریست
    CANCELED("درخواست انتقال وجه ملغی گردید"),                                           //درخواست انتقال وجه ثبت و پیش از رسیدن موعد انجام ملغی گردید
    NONE("نامشخص");

    String title;

    PaymentStatusDto(String title) {
        this.title = title;
    }

    public static PaymentStatusDto getEnum(String str){
        if(str.equals("RECEIVED")){
            return RECEIVED;
        }
        if(str.equals("PROCESSING")){
            return PROCESSING;
        }
        if(str.equals("REGISTERED")){
            return REGISTERED;
        }
        if(str.equals("SUCCEEDED")){
            return SUCCEEDED;
        }
        if(str.equals("FAILED")){
            return FAILED;
        }
        if(str.equals("CONTRADICTION")){
            return CONTRADICTION;
        }
        if(str.equals("CANCELED")){
            return CANCELED;
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
