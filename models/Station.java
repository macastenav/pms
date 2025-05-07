package models;

import java.util.Date;

public class Station {
    private String id;
    private String name;
    private String address;
    private String city;
    private String zipCode;
    private String phoneNumber;
    private String commanderName;
    private int numberOfPolices;
    private int numberOfCars;
    private String operatingHours;
    private String email;
    private Date dateEstablished;

    public Station(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Station(String id, String name, String address, String city, String zipCode,
                   String phoneNumber, String commanderName, int numberOfPolices,
                   int numberOfCars, String operatingHours, String email, Date dateEstablished) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.commanderName = commanderName;
        this.numberOfPolices = numberOfPolices;
        this.numberOfCars = numberOfCars;
        this.operatingHours = operatingHours;
        this.email = email;
        this.dateEstablished = dateEstablished;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getCommanderName() { return commanderName; }
    public void setCommanderName(String commanderName) { this.commanderName = commanderName; }

    public int getNumberOfPolices() { return numberOfPolices; }
    public void setNumberOfPolices(int numberOfPolices) { this.numberOfPolices = numberOfPolices; }

    public int getNumberOfCars() { return numberOfCars; }
    public void setNumberOfCars(int numberOfCars) { this.numberOfCars = numberOfCars; }

    public String getOperatingHours() { return operatingHours; }
    public void setOperatingHours(String operatingHours) { this.operatingHours = operatingHours; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Date getDateEstablished() { return dateEstablished; }
    public void setDateEstablished(Date dateEstablished) { this.dateEstablished = dateEstablished; }

    @Override
    public String toString() {
        return "Station{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", commanderName='" + commanderName + '\'' +
                '}';
    }
}