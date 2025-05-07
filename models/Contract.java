package models;

import enums.ContractType;
import java.util.Date;

public class Contract {
    private String id;
    private Police belongsToPolice;
    private String signedBy;
    private Date signedDate;
    private Station belongsToStation;
    private Date expireDate;
    private ContractType contractType;
    private double salary;
    private String positionTitle;
    private String workingHours;
    private boolean isActive;

    public Contract(String id, Police belongsToPolice) {
        this.id = id;
        this.belongsToPolice = belongsToPolice;
    }

    public Contract(String id, Police belongsToPolice, String signedBy, Date signedDate,
                    Station belongsToStation, Date expireDate, ContractType contractType,
                    double salary, String positionTitle, String workingHours, boolean isActive) {
        this.id = id;
        this.belongsToPolice = belongsToPolice;
        this.signedBy = signedBy;
        this.signedDate = signedDate;
        this.belongsToStation = belongsToStation;
        this.expireDate = expireDate;
        this.contractType = contractType;
        this.salary = salary;
        this.positionTitle = positionTitle;
        this.workingHours = workingHours;
        this.isActive = isActive;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Police getBelongsToPolice() { return belongsToPolice; }
    public void setBelongsToPolice(Police belongsToPolice) { this.belongsToPolice = belongsToPolice; }

    public String getSignedBy() { return signedBy; }
    public void setSignedBy(String signedBy) { this.signedBy = signedBy; }

    public Date getSignedDate() { return signedDate; }
    public void setSignedDate(Date signedDate) { this.signedDate = signedDate; }

    public Station getBelongsToStation() { return belongsToStation; }
    public void setBelongsToStation(Station belongsToStation) { this.belongsToStation = belongsToStation; }

    public Date getExpireDate() { return expireDate; }
    public void setExpireDate(Date expireDate) { this.expireDate = expireDate; }

    public ContractType getContractType() { return contractType; }
    public void setContractType(ContractType contractType) { this.contractType = contractType; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getPositionTitle() { return positionTitle; }
    public void setPositionTitle(String positionTitle) { this.positionTitle = positionTitle; }

    public String getWorkingHours() { return workingHours; }
    public void setWorkingHours(String workingHours) { this.workingHours = workingHours; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    @Override
    public String toString() {
        return "Contract{" +
                "id='" + id + '\'' +
                ", police=" + belongsToPolice.getName() +
                ", station=" + belongsToStation.getName() +
                ", contractType=" + contractType +
                ", isActive=" + isActive +
                '}';
    }
}