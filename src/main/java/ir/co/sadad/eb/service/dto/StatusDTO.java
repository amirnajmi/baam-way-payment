package ir.co.sadad.eb.service.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;


@Data
public class StatusDTO {

    @NotNull
    private Short statusCode;
    @NotNull
    private String title;


}
