package ir.co.sadad.eb.resource.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BillDetailDto {
    private Integer id;
    private String loadNumber;
    private String departureNumber ;
    private LocalDate loadDate;
    private LocalDate departureDate;
    private String sourceState;
    private String destinitionState;
    private Double weightAtTimeOfLoad;
    private Double weightAtTimeOfDeparture;
    private String State;
    private String sourceVehicleName;

}
