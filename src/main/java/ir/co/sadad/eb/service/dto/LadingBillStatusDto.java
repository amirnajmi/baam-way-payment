package ir.co.sadad.eb.service.dto;

import java.io.Serializable;

public class LadingBillStatusDto implements Serializable {

    private Integer code;
    private String Title;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
