package ir.co.sadad.eb.domain;

import javax.persistence.*;

//اطلاعات حساب
@Entity
@Table(name = "ACCOUNT" , schema = "PUSH")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id ;
    @Column(name = "ACCOUNT_NO")
    //شماره حساب
    private String accountNo;
    @Column(name = "ACCOUNT_OWNER")
    // نام صاحب حساب
    private String accountOwner;
    @Column(name = "IBAN")
    //شماره شبا حساب
    private String iban;
    @Column(name = "STATE")
    //وضعیت حساب
    private Integer state;

    @Column(name = "DESC")
    //وضعیت حساب
    private String desc;
    @Column(name = "DESC2")
    //وضعیت حساب
    private String desc2;

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

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }
}
