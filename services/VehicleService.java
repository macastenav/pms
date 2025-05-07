package services;

import models.Vehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleService {
    private List<Vehicle> vehicleList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void createVehicle() {
        System.out.println("Enter vehicle details:");
        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Car Name: ");
        String carName = scanner.nextLine();

        System.out.print("Car Plates: ");
        String carPlates = scanner.nextLine();

        // Add more fields as needed

        Vehicle vehicle = new Vehicle(id, carName);
        vehicleList.add(vehicle);
        System.out.println("Vehicle created successfully!");
    }

    public void readAllVehicles() {
        System.out.println("All Vehicles:");
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }
    }

    public void updateVehicle() {
        System.out.print("Enter vehicle ID to update: ");
        String id = scanner.nextLine();

        Vehicle vehicleToUpdate = null;
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equals(id)) {
                vehicleToUpdate = vehicle;
                break;
            }
        }

        if (vehicleToUpdate != null) {
            System.out.print("Enter new status: ");
            String newStatus = scanner.nextLine();
            // You would need to convert this to the enum type

            // Update other fields as needed

            System.out.println("Vehicle updated successfully!");
        } else {
            System.out.println("Vehicle not found with ID: " + id);
        }
    }

    public void deleteVehicle() {
        System.out.print("Enter vehicle ID to delete: ");
        String id = scanner.nextLine();

        Vehicle vehicleToDelete = null;
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equals(id)) {
                vehicleToDelete = vehicle;
                break;
            }
        }

        if (vehicleToDelete != null) {
            vehicleList.remove(vehicleToDelete);
            System.out.println("Vehicle deleted successfully!");
        } else {
            System.out.println("Vehicle not found with ID: " + id);
        }
    }
}