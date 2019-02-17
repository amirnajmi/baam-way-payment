package ir.co.sadad.eb.domain;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Table(name = "SHIPPING_COMPANY", schema = "BAMWAY")
public class ShippingCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LEGAL_NO")
    private String legalNo;

    @OneToOne(targetEntity = Account.class, cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_ID")
    private Account account;

    @OneToOne(targetEntity = Account.class, cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_ON_SIC_AUTHORITY")
    //حساب در اختیار سداد
    private Account accountOnSicAuthority;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLegalNo() {
        return legalNo;
    }

    public void setLegalNo(String legalNo) {
        this.legalNo = legalNo;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccountOnSicAuthority() {
        return accountOnSicAuthority;
    }

    public void setAccountOnSicAuthority(Account accountOnSicAuthority) {
        this.accountOnSicAuthority = accountOnSicAuthority;
    }
}
