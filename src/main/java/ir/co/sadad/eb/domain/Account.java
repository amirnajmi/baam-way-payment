package ir.co.sadad.eb.domain;

import javax.persistence.*;

//اطلاعات حساب
@Entity
@Table(name = "ACCOUNT", schema = "PUSH")
public class Account {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //شماره حساب
    @Column(name = "ACCOUNT_NO")
    private String accountNo;

    // نام صاحب حساب
    @Column(name = "ACCOUNT_OWNER")
    private String accountOwner;

    //شماره شبا حساب
    @Column(name = "IBAN")
    private String iban;

    //وضعیت حساب
    @Column(name = "STATE")
    private Integer state;

    @Column(name = "DESC2")
    private String desc2;

    @Column(name = "DESC3")
    private String desc3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    public String getDesc3() {
        return desc3;
    }

    public void setDesc3(String desc3) {
        this.desc3 = desc3;
    }
}
