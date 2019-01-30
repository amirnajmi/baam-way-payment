package ir.co.sadad.eb.service.dto;

import org.joda.time.LocalDate;

import java.io.Serializable;

public class LadingBillStatusHistoryDto implements Serializable {

    private Long id;
    private String description;
    private LocalDate date;
    private LadingOfBillDto ladingOfBill;
    private Integer ladingBillStatus;

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

    public Integer getLadingBillStatus() {
        return ladingBillStatus;
    }

    public void setLadingBillStatus(Integer ladingBillStatus) {
        this.ladingBillStatus = ladingBillStatus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
