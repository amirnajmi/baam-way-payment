package ir.co.sadad.eb.domain;

public enum PaymentStatus {

    RECEIVED(1,"درخواست انتقال دریافت شد"),                                                //درخواست انتقال دریافت شد و منتظر تایید است
    PROCESSING(2,"تراکنش درحال پردازش است"),                                               //تراکنش درحال پردازش است. برای دریافت نتیجه نهایی استعلام شود
    REGISTERED(3,"تراکنش با موفقیت از سمت مبدا ثبت شده و به بانک مقصد ارسال شده است"),     //تراکنش در سامانه بین بانکی با موفقیت از سمت مبدا ثبت شده و به بانک مقصد ارسال شده است
    SUCCEEDED(4,"انتقال موفقیت آمیز بوده است"),                                            //انتقال موفقیت آمیز بوده است
    FAILED(5,"تراکنش ناموفق بوده است"),                                                    //تراکنش ناموفق بوده است
    CONTRADICTION(6,"وضعیت تراکنش دارای مغایرت است"),                                      //وضعیت تراکنش دارای مغایرت است. این حالت معمولا تنها در پاسخ به سرویس استعلام انتقال وجه دریافت میگردد و نیازمند پیگیریست
    CANCELED(7,"درخواست انتقال وجه ملغی گردید"),                                           //درخواست انتقال وجه ثبت و پیش از رسیدن موعد انجام ملغی گردید
    NONE(8,"نامشخص");

    private Integer code;
    private String title;

    PaymentStatus(Integer code , String title) {
        this.title = title;
        this.code= code ;
    }

    public static PaymentStatus getEnum(String str){
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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
