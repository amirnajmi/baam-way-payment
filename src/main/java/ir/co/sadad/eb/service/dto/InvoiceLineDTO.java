package ir.co.sadad.eb.service.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class InvoiceLineDTO {

    private Integer id;
    private String loadNumber;
    private String State;
    private String sourceVehicleName;

}
