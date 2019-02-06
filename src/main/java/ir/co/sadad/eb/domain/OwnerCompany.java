package ir.co.sadad.eb.domain;

import javax.persistence.*;

@Entity
@Table(name = "OWNER_COMPANY", schema = "BAMWAY")
public class OwnerCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LEGAL_NO")
    private String legalNo;

    @OneToOne(targetEntity = Account.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ACCOUNT_ID")
    private Account account;

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
}
