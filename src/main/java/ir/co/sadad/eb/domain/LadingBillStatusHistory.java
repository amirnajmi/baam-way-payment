package ir.co.sadad.eb.domain;

import java.time.*;

import javax.persistence.*;

@Entity
@Table(name = "LADING_BILL_STATUS_HISTORY", schema = "PUSH")
public class LadingBillStatusHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(targetEntity = LadingOfBill.class)
    @JoinColumn(name = "LADING_OF_BILL_ID", referencedColumnName = "ID")
    private LadingOfBill ladingOfBill;

    @Column(name = "LADING_BILL_STATUS")
    @Enumerated(EnumType.STRING)
    private LadingBillStatus ladingBillStatus;

    @Basic
    @Column(name = "DESCRIPTION")
    private String description;

    @Basic
    @Column(name = "DATE")
    private LocalDate date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LadingOfBill getLadingOfBill() {
        return ladingOfBill;
    }

    public void setLadingOfBill(LadingOfBill ladingOfBill) {
        this.ladingOfBill = ladingOfBill;
    }

    public LadingBillStatus getLadingBillStatus() {
        return ladingBillStatus;
    }

    public void setLadingBillStatus(LadingBillStatus ladingBillStatus) {
        this.ladingBillStatus = ladingBillStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
