package ir.co.sadad.eb.service.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class InvoiceDetailDTO {

    private Integer id;
    //     شماره ورود
    private String loadCode;
    //     شماره خروح
    private String departureCode;
    //    نام وسیله حمل کننده اولیه بار(کشتی)
    private String sourceVehicleName;
    //    انبار مبدا
    private String sourceStoreHouse;
    //    انبار مقصد
    private String destinationStoreHouse;
    //    کد استان مبدا
    private String sourceProvinceCode;
    //    کد استان مقصد
    private String destinationProvinceCode;
    //    عوارض
    private Double receipt;
    //    پلاک یا شماره وسیله نقلیه حامل
    private String vehicleTag;
    //    شماره بارنامه
    private String wayBillCode;
    //  وزن خروج از مبدا
    private Double departureWeight;
    //  وزن ورود به مقصد
    private Double loadWeight;
    //  کسری مجاز
    private Double allowedDeficit;
    // کسری غیرمجاز
    private Double illegalDeficit;
    //  نرخ کرایه حمل
    private Double carriageRate;
    //  کرایه حمل
    private Double carriageFare;
    //  حق مدیریت
    private Double managerSalary ;
    // حق بیمه
    private Double premium;
    // مقدار غرامت دستی :|
    private Double amountOfHandyIndemnity;
    // مبلغ غرامت دستی :|
    private Double feeOfHandyIndemnity;
    // مقدار غرامت نرسیده :|
    private Double amountOfNotArrivedIndemnity;
    // مبلغ غرامت نرسیده :|
    private Double feeOfNotArrivedIndemnity;
    // مسافت
    private Double distance ;
}
