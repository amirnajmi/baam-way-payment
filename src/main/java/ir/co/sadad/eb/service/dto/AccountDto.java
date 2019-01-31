package ir.co.sadad.eb.service.dto;

import java.io.Serializable;


//todo don't use lombok in dtos

public class AccountDto implements Serializable {

    private Long id ;
    //شماره حساب
    private String accountNo;
    // نام صاحب حساب
    private String accountOwner;
    //شماره شبا حساب
    private String IBAN;
    //وضعیت حساب
    private Integer state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
