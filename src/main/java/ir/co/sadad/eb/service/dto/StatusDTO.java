package ir.co.sadad.eb.service.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Data
public class StatusDTO implements Serializable {

    @NotNull
    private Short statusCode;
    @NotNull
    private String title;


}
