package ir.co.sadad.eb.domain;

import javax.persistence.*;

@Entity
@Table(name = "Driver" ,schema = "TEST")
public class Driver {

    @Id
    @Column(name = "DRIVER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverID;

    @Column(name = "DRIVER_NAME" , length=50, nullable=false)
    private String driverName;

    @Column(name = "NATIONAL_CODE" , length=10, nullable=false)
    private String nationalCode;

    @Column(name = "ACCOUNT_NO" , length=13, nullable=false)
    private String accountNo;

    @Column(name = "SMART_CARD_NO" , length=30, nullable=false)
    private String smartCardNo;

    //remove
    @Column(name = "LICENCE_NO" , length=30, nullable=true)
    private String licenceNo;

    //remove
    @Column(name = "ADDRESS" , length=13, nullable=true)
    private String address ;

    //driverKind

    @Column(name = "TELL" , length=11, nullable=false)
    private String tell;

    private Account account;
    private Vehicle vehicle;

}
