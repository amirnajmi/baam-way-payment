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
    private Boolean state;

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

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
