package models;

import enums.Rank;
import enums.PoliceStatus;
import java.util.Date;
import java.util.List;

public class Police {
    private String id;
    private String name;
    private String surname;
    private Date dateOfBirth;
    private String gender;
    private Rank rank;
    private Date hireDate;
    private List<Ticket> ticketsGiven;
    private Station workingStation;
    private String phoneNumber;
    private String email;
    private PoliceStatus status;
    private String emergencyContact;

    public Police(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Police(String id, String name, String surname, Date dateOfBirth, String gender, Rank rank,
                  Date hireDate, Station workingStation, String phoneNumber, String email,
                  PoliceStatus status, String emergencyContact) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.rank = rank;
        this.hireDate = hireDate;
        this.workingStation = workingStation;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.status = status;
        this.emergencyContact = emergencyContact;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public Rank getRank() { return rank; }
    public void setRank(Rank rank) { this.rank = rank; }

    public Date getHireDate() { return hireDate; }
    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }

    public List<Ticket> getTicketsGiven() { return ticketsGiven; }
    public void setTicketsGiven(List<Ticket> ticketsGiven) { this.ticketsGiven = ticketsGiven; }

    public Station getWorkingStation() { return workingStation; }
    public void setWorkingStation(Station workingStation) { this.workingStation = workingStation; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public PoliceStatus getStatus() { return status; }
    public void setStatus(PoliceStatus status) { this.status = status; }

    public String getEmergencyContact() { return emergencyContact; }
    public void setEmergencyContact(String emergencyContact) { this.emergencyContact = emergencyContact; }

    @Override
    public String toString() {
        return "Police{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", rank=" + rank +
                ", status=" + status +
                '}';
    }
}