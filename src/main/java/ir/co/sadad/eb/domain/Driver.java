package ir.co.sadad.eb.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DRIVER" ,schema = "PUSH")
public class Driver {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DRIVER_NAME" , length=50, nullable=false)
    private String driverName;

    @Column(name = "NATIONAL_CODE" , length=10, nullable=false)
    private String nationalCode;

    @Column(name = "SMART_CARD_NO" , length=30, nullable=false)
    private String smartCardNo;

    //remove
    @Column(name = "LICENCE_NO" , length=30, nullable=true)
    private String licenceNo;

    //remove
    @Column(name = "ADDRESS" , length=13, nullable=true)
    private String address ;

    @Column(name = "KIND" , nullable=true)
    private String kind ;
    //driverKind

    @Column(name = "TELL" , length=11, nullable=false)
    private String tell;

    @OneToOne(targetEntity = Account.class)
    private Account account;

//    @OneToOne(targetEntity = Vehicle.class, fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "VEHICLE_ID")
//    private Vehicle vehicle;

    @ManyToMany(mappedBy = "drivers")
    private List<LadingOfBill> ladingOfBills;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getSmartCardNo() {
        return smartCardNo;
    }

    public void setSmartCardNo(String smartCardNo) {
        this.smartCardNo = smartCardNo;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<LadingOfBill> getLadingOfBills() {
        return ladingOfBills;
    }

    public void setLadingOfBills(List<LadingOfBill> ladingOfBills) {
        this.ladingOfBills = ladingOfBills;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
