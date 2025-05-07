package models;

import enums.PaymentMethod;
import java.util.Date;

public class Ticket {
    private String id;
    private String person;
    private String personID;
    private String carName;
    private String carPlates;
    private Date date;
    private Police givenBy;
    private String ticketReason;
    private double ticketFee;
    private String location;
    private boolean isPaid;
    private Date paymentDate;
    private PaymentMethod paymentMethod;
    private String notes;

    public Ticket(String id, String person) {
        this.id = id;
        this.person = person;
    }

    public Ticket(String id, String person, String personID, String carName, String carPlates,
                  Date date, Police givenBy, String ticketReason, double ticketFee,
                  String location, boolean isPaid, PaymentMethod paymentMethod, String notes) {
        this.id = id;
        this.person = person;
        this.personID = personID;
        this.carName = carName;
        this.carPlates = carPlates;
        this.date = date;
        this.givenBy = givenBy;
        this.ticketReason = ticketReason;
        this.ticketFee = ticketFee;
        this.location = location;
        this.isPaid = isPaid;
        this.paymentMethod = paymentMethod;
        this.notes = notes;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPerson() { return person; }
    public void setPerson(String person) { this.person = person; }

    public String getPersonID() { return personID; }
    public void setPersonID(String personID) { this.personID = personID; }

    public String getCarName() { return carName; }
    public void setCarName(String carName) { this.carName = carName; }

    public String getCarPlates() { return carPlates; }
    public void setCarPlates(String carPlates) { this.carPlates = carPlates; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public Police getGivenBy() { return givenBy; }
    public void setGivenBy(Police givenBy) { this.givenBy = givenBy; }

    public String getTicketReason() { return ticketReason; }
    public void setTicketReason(String ticketReason) { this.ticketReason = ticketReason; }

    public double getTicketFee() { return ticketFee; }
    public void setTicketFee(double ticketFee) { this.ticketFee = ticketFee; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public boolean isPaid() { return isPaid; }
    public void setPaid(boolean paid) { isPaid = paid; }

    public Date getPaymentDate() { return paymentDate; }
    public void setPaymentDate(Date paymentDate) { this.paymentDate = paymentDate; }

    public PaymentMethod getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(PaymentMethod paymentMethod) { this.paymentMethod = paymentMethod; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", person='" + person + '\'' +
                ", carPlates='" + carPlates + '\'' +
                ", ticketFee=" + ticketFee +
                ", isPaid=" + isPaid +
                '}';
    }
}