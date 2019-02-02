package ir.co.sadad.eb.service.dto;


import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;
import java.time.LocalDate;

@Schema(name = "LadingBillStatusHistoryDto", description = "تاریخچه وضعیت بارنامه")
public class LadingBillStatusHistoryDto implements Serializable {

    @Schema(example = "0", description = "شناسه")
    private Long id;
    @Schema(required = true, example = "10", description = "توضیحات")
    private String description;
    @Schema(required = true, example = "10", description = "تاریخ")
    private LocalDate date;
    @Schema(required = true, description = "بارنامه")
    private LadingOfBillDto ladingOfBill;
    @Schema(required = true, description = "وضعیت بارنامه")
    private LadingBillStatusDto ladingBillStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LadingOfBillDto getLadingOfBill() {
        return ladingOfBill;
    }

    public void setLadingOfBill(LadingOfBillDto ladingOfBill) {
        this.ladingOfBill = ladingOfBill;
    }

    public LadingBillStatusDto getLadingBillStatus() {
        return ladingBillStatus;
    }

    public void setLadingBillStatus(LadingBillStatusDto ladingBillStatus) {
        this.ladingBillStatus = ladingBillStatus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
