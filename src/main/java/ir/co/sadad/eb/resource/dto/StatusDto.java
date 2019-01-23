package ir.co.sadad.eb.resource.dto;

import javax.validation.constraints.NotNull;


public class StatusDto {

    @NotNull
    private Short statusCode;
    @NotNull
    private String title;


}
