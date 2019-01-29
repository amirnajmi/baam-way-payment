package ir.co.sadad.eb.service.dto;

import java.io.Serializable;


//todo don't use lombok in dtos

public class AccountDto implements Serializable {

    private Long id ;
    //شماره حساب
    private String AccountNo;
    // نام صاحب حساب
    private String accountOwner;
    //شماره شبا حساب
    private String IBAN;
    //وضعیت حساب
    private Boolean state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
