package ir.co.sadad.eb.service.dto;

//todo don't use lombok in dtos

import ir.co.sadad.eb.domain.LadingOfBill;

public class InvoiceDetailDTO {

    private Long id;
    //بارنامه
    private LadingOfBillDto ladingOfBillDto;

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

    public LadingOfBillDto getLadingOfBillDto() {
        return ladingOfBillDto;
    }

    public void setLadingOfBillDto(LadingOfBillDto ladingOfBillDto) {
        this.ladingOfBillDto = ladingOfBillDto;
    }
}
