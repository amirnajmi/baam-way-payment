package ir.co.sadad.eb.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "LADING_OF_BILL", schema = "PUSH")
public class LadingOfBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    //تاریخ بارنامه
    @Column(name = "DATE")
    private LocalDate date;
    //شماره بارنامه
    @Column(name = "NO")
    private String no;
    //سریال بارنامه
    @Column(name = "SERIAL")
    private String serial;
    //شماره حواله
    @Column(name = "ORDER_NO")
    private String orderNo;
    //استان مبدا
    @Column(name = "SOURCEP_ROVINCE")
    private String sourceProvince;
    //استان مقصد
    @Column(name = "DESTINATION_PROVINCE")
    private String destinationProvince;
    //شهر مبدا
    @Column(name = "SOURCE_CITY")
    private String sourceCity;
    //شهر مقصد
    @Column(name = "DESTINATION_CITY")
    private String destinationCity;
    //مبلغ کرایه
    @Column(name = "FREIGHT_AMOUNT")
    private Double freightAmount;
    //مبلغ قابل پرداخت
    @Column(name = "PAYABLE_AMOUNT")
    private Double payableAmount;
    //سهم راننده
    @Column(name = "DRIVER_CONTRIBUTION")
    private Double driverContribution;
    //سهم شرکت حمل
    @Column(name = "SHIPPING_COMPANY_CONTRIBUTION")
    private Double shippingCompanyContribution;
    //عوارض
    @Column(name = "RECEIPT")
    private Double toll;
    //کسری مجاز
    @Column(name = "ALLOWED_DEFICIT")
    private Double allowedDeficit;
    //کسری غیرمجاز
    @Column(name = "ILLEGAL_DEFICIT")
    private Double illegalDeficit;
    //نرخ کرایه حمل
    @Column(name = "CARRIAGE_RATE")
    private Double carriageRate;
    //کرایه حمل
    @Column(name = "CARRIAGE_FARE")
    private Double carriageFare;
    //حق مدیریت
    @Column(name = "MANAGER_SALARY")
    private Double managerSalary ;
    //حق بیمه
    @Column(name = "PREMIUM")
    private Double premium;
    // مقدار غرامت دستی :|
    @Column(name = "AMOUNT_OF_HANDY_INDEMNITY")
    private Double amountOfHandyIndemnity;
    // مبلغ غرامت دستی :|
    @Column(name = "FEE_OF_HANDY_INDEMNITY")
    private Double feeOfHandyIndemnity;
    // مقدار غرامت نرسیده :|
    @Column(name = "AMOUNT_OF_NOT_ARRIVED_INDEMNITY")
    private Double amountOfNotArrivedIndemnity;
    // مبلغ غرامت نرسیده :|
    @Column(name = "FEE_OF_NOT_ARRIVED_INDEMNITY")
    private Double feeOfNotArrivedIndemnity;
    // مسافت
    @Column(name = "DISTANCE")
    private Double distance;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "LADING_OF_BILL_DRIVER",
            joinColumns = @JoinColumn(name = "LADING_OF_BILL_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "DRIVER_ID", referencedColumnName = "ID")
    )
    private List<Driver> drivers;

    @OneToOne(targetEntity = Cargo.class, fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CARGO_ID")
    // محموله
    private Cargo cargo;

    @ManyToOne(targetEntity = Vehicle.class)
    @JoinColumn(name = "VEHICLE_ID", referencedColumnName = "ID")
    private Vehicle vehicle;

    // شرکت حمل
    @ManyToOne(targetEntity = ShippingCompany.class)
    private ShippingCompany shippingCompany;

    @ManyToOne(targetEntity = OwnerCompany.class)
    //شرکت بازرگانی
    private OwnerCompany ownerCompany;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getSourceProvince() {
        return sourceProvince;
    }

    public void setSourceProvince(String sourceProvince) {
        this.sourceProvince = sourceProvince;
    }

    public String getDestinationProvince() {
        return destinationProvince;
    }

    public void setDestinationProvince(String destinationProvince) {
        this.destinationProvince = destinationProvince;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(String sourceCity) {
        this.sourceCity = sourceCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public Double getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(Double freightAmount) {
        this.freightAmount = freightAmount;
    }

    public Double getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(Double payableAmount) {
        this.payableAmount = payableAmount;
    }

    public Double getDriverContribution() {
        return driverContribution;
    }

    public void setDriverContribution(Double driverContribution) {
        this.driverContribution = driverContribution;
    }

    public Double getShippingCompanyContribution() {
        return shippingCompanyContribution;
    }

    public void setShippingCompanyContribution(Double shippingCompanyContribution) {
        this.shippingCompanyContribution = shippingCompanyContribution;
    }

    public Double getAllowedDeficit() {
        return allowedDeficit;
    }

    public void setAllowedDeficit(Double allowedDeficit) {
        this.allowedDeficit = allowedDeficit;
    }

    public Double getIllegalDeficit() {
        return illegalDeficit;
    }

    public void setIllegalDeficit(Double illegalDeficit) {
        this.illegalDeficit = illegalDeficit;
    }

    public Double getCarriageRate() {
        return carriageRate;
    }

    public void setCarriageRate(Double carriageRate) {
        this.carriageRate = carriageRate;
    }

    public Double getCarriageFare() {
        return carriageFare;
    }

    public void setCarriageFare(Double carriageFare) {
        this.carriageFare = carriageFare;
    }

    public Double getManagerSalary() {
        return managerSalary;
    }

    public void setManagerSalary(Double managerSalary) {
        this.managerSalary = managerSalary;
    }

    public Double getPremium() {
        return premium;
    }

    public void setPremium(Double premium) {
        this.premium = premium;
    }

    public Double getAmountOfHandyIndemnity() {
        return amountOfHandyIndemnity;
    }

    public void setAmountOfHandyIndemnity(Double amountOfHandyIndemnity) {
        this.amountOfHandyIndemnity = amountOfHandyIndemnity;
    }

    public Double getFeeOfHandyIndemnity() {
        return feeOfHandyIndemnity;
    }

    public void setFeeOfHandyIndemnity(Double feeOfHandyIndemnity) {
        this.feeOfHandyIndemnity = feeOfHandyIndemnity;
    }

    public Double getAmountOfNotArrivedIndemnity() {
        return amountOfNotArrivedIndemnity;
    }

    public void setAmountOfNotArrivedIndemnity(Double amountOfNotArrivedIndemnity) {
        this.amountOfNotArrivedIndemnity = amountOfNotArrivedIndemnity;
    }

    public Double getFeeOfNotArrivedIndemnity() {
        return feeOfNotArrivedIndemnity;
    }

    public void setFeeOfNotArrivedIndemnity(Double feeOfNotArrivedIndemnity) {
        this.feeOfNotArrivedIndemnity = feeOfNotArrivedIndemnity;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public ShippingCompany getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(ShippingCompany shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public OwnerCompany getOwnerCompany() {
        return ownerCompany;
    }

    public void setOwnerCompany(OwnerCompany ownerCompany) {
        this.ownerCompany = ownerCompany;
    }

    public Double getToll() {
        return toll;
    }

    public void setToll(Double toll) {
        this.toll = toll;
    }
}
