package ir.co.sadad.eb.resource.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BillMasterDto {

    private String Date ;
    private LocalDate billDate ;
    private String shippingCompany;
    private String processKind;
    private LocalDate date;
    private String billNumber;

}
