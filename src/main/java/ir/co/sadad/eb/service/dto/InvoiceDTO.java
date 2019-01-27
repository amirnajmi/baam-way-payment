package ir.co.sadad.eb.service.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class InvoiceDTO {

    //    تاریخ صورتحساب
    private LocalDate invoiceDate;
    //    تاریخ
    private LocalDate date;
    //    شرکت حمل
    private String shippingCompanyCode;
    //    کد نوع فرآیند
    private String processKindCode;
    //    شماره قرارداد
    private String contractNumber;
    //    شماره صورتحساب
    private String invoiceNumber;

}
