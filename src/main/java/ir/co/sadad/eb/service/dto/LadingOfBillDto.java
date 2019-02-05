package ir.co.sadad.eb.service.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Schema(name = "LadingOfBill", description = "بارنامه")
public class LadingOfBillDto implements Serializable {

    public LadingOfBillDto() {
    }

    @Schema(description = "شناسه")
    private Long id;
    @Schema(required = true , example = "512689700" , description = "کد پیگیری بارنامه")
    private Long trackingCode;
    @Schema(required = true , example = "2019-02-15" , description = "تاریخ بارنامه")
    private LocalDate date;
    @Schema(required = true , example = "12345" , description = "شماره بارنامه")
    private String no;
    @Schema(required = true , example = "12345" , description = "سریال بارنامه")
    private String serial;
    @Schema(required = true , example = "123" , description = "شماره حواله")
    private String orderNo;
    @Schema(required = true , example = "بندر عباس" , description = "استان مبدا")
    private String sourceProvince;
    @Schema(required = true , example = "تهران" , description = "استان مقصد")
    private String destinationProvince;
    @Schema(required = true , example = "100000" , description = "شهر مبدا")
    private String sourceCity;
    @Schema(required = true , example = "99000" , description = "شهر مقصد")
    private String destinationCity;
    @Schema(required = true , example = "136.4" , description = "مسافت")
    private Double distance ;
    @Schema(required = true , description = "راننده ها")
    private List<DriverDto> drivers;
    @Schema(required = true , description = "محموله")
    private CargoDto cargo;
    @Schema(required = true , description = "خودرو")
    private VehicleDto vehicle;

    @Schema(required = true , description = "شرکت حمل" )
    private ShippingCompanyDto shippingCompany;
    @Schema(required = true , description = "شرکت کارفرما" )
    private OwnerCompanyDto ownerCompany;


    public ShippingCompanyDto getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(ShippingCompanyDto shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public OwnerCompanyDto getOwnerCompany() {
        return ownerCompany;
    }

    public void setOwnerCompany(OwnerCompanyDto ownerCompany) {
        this.ownerCompany = ownerCompany;
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

    public List<DriverDto> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<DriverDto> drivers) {
        this.drivers = drivers;
    }

    public CargoDto getCargo() {
        return cargo;
    }

    public void setCargo(CargoDto cargo) {
        this.cargo = cargo;
    }

    public VehicleDto getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleDto vehicle) {
        this.vehicle = vehicle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(Long trackingCode) {
        this.trackingCode = trackingCode;
    }
}
