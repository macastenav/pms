package models;

import enums.VehicleStatus;
import java.util.Date;

public class Vehicle {
    private String id;
    private String carName;
    private String carModel;
    private String carVIN;
    private String carPlates;
    private int yearOfManufacture;
    private Station belongsToStation;
    private Police belongToPolice;
    private Date createdAt;
    private Date lastServiceDate;
    private VehicleStatus status;
    private double mileage;

    public Vehicle(String id, String carName) {
        this.id = id;
        this.carName = carName;
    }

    public Vehicle(String id, String carName, String carModel, String carVIN, String carPlates,
                   int yearOfManufacture, Station belongsToStation, Police belongToPolice,
                   Date createdAt, Date lastServiceDate, VehicleStatus status, double mileage) {
        this.id = id;
        this.carName = carName;
        this.carModel = carModel;
        this.carVIN = carVIN;
        this.carPlates = carPlates;
        this.yearOfManufacture = yearOfManufacture;
        this.belongsToStation = belongsToStation;
        this.belongToPolice = belongToPolice;
        this.createdAt = createdAt;
        this.lastServiceDate = lastServiceDate;
        this.status = status;
        this.mileage = mileage;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getCarName() { return carName; }
    public void setCarName(String carName) { this.carName = carName; }

    public String getCarModel() { return carModel; }
    public void setCarModel(String carModel) { this.carModel = carModel; }

    public String getCarVIN() { return carVIN; }
    public void setCarVIN(String carVIN) { this.carVIN = carVIN; }

    public String getCarPlates() { return carPlates; }
    public void setCarPlates(String carPlates) { this.carPlates = carPlates; }

    public int getYearOfManufacture() { return yearOfManufacture; }
    public void setYearOfManufacture(int yearOfManufacture) { this.yearOfManufacture = yearOfManufacture; }

    public Station getBelongsToStation() { return belongsToStation; }
    public void setBelongsToStation(Station belongsToStation) { this.belongsToStation = belongsToStation; }

    public Police getBelongToPolice() { return belongToPolice; }
    public void setBelongToPolice(Police belongToPolice) { this.belongToPolice = belongToPolice; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

    public Date getLastServiceDate() { return lastServiceDate; }
    public void setLastServiceDate(Date lastServiceDate) { this.lastServiceDate = lastServiceDate; }

    public VehicleStatus getStatus() { return status; }
    public void setStatus(VehicleStatus status) { this.status = status; }

    public double getMileage() { return mileage; }
    public void setMileage(double mileage) { this.mileage = mileage; }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", carName='" + carName + '\'' +
                ", carPlates='" + carPlates + '\'' +
                ", status=" + status +
                '}';
    }
}