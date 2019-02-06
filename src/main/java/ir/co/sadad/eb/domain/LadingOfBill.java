package ir.co.sadad.eb.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.*;
import java.util.List;

@Entity
@Table(name = "LADING_OF_BILL", schema = "BAMWAY")
public class LadingOfBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    //کد پیگیری بارنامه
    @Column(name = "TRACKING_CODE")
    private String trackingCode;
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

    @ManyToOne(targetEntity = Vehicle.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "VEHICLE_ID", referencedColumnName = "ID")
    private Vehicle vehicle;

    // شرکت حمل
    @ManyToOne(targetEntity = ShippingCompany.class )
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

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }
}
