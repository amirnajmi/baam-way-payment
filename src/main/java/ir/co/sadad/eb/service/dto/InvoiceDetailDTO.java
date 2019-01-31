package ir.co.sadad.eb.service.dto;

//todo don't use lombok in dtos

public class InvoiceDetailDTO {

    private Long id;
    private String ladingOfBillSeries;
    private String ladingOfBillCode;
    private InvoiceDTO invoiceDTO;

    //     شماره ورود
//    private String loadCode;
    //     شماره خروح
//    private String departureCode;
//        نام وسیله حمل کننده اولیه بار(کشتی)
//    private String sourceVehicleName;
    //    انبار مبدا
//    private String sourceStoreHouse;
    //    انبار مقصد
//    private String destinationStoreHouse;
    //    کد استان مبدا
//    private String sourceProvinceCode;
    //    کد استان مقصد
//    private String destinationProvinceCode;
    //    عوارض
//    private Double receipt;
    //    پلاک یا شماره وسیله نقلیه حامل
//    private String vehicleTag;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLadingOfBillSeries() {
        return ladingOfBillSeries;
    }

    public void setLadingOfBillSeries(String ladingOfBillSeries) {
        this.ladingOfBillSeries = ladingOfBillSeries;
    }

    public String getLadingOfBillCode() {
        return ladingOfBillCode;
    }

    public void setLadingOfBillCode(String ladingOfBillCode) {
        this.ladingOfBillCode = ladingOfBillCode;
    }

    public InvoiceDTO getInvoiceDTO() {
        return invoiceDTO;
    }

    public void setInvoiceDTO(InvoiceDTO invoiceDTO) {
        this.invoiceDTO = invoiceDTO;
    }
}
