package services;

import models.Station;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StationService {
    private List<Station> stationList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void createStation() {
        System.out.println("Enter station details:");
        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        // Add more fields as needed

        Station station = new Station(id, name, address);
        stationList.add(station);
        System.out.println("Station created successfully!");
    }

    public void readAllStations() {
        System.out.println("All Stations:");
        for (Station station : stationList) {
            System.out.println(station);
        }
    }

    public void updateStation() {
        System.out.print("Enter station ID to update: ");
        String id = scanner.nextLine();

        Station stationToUpdate = null;
        for (Station station : stationList) {
            if (station.getId().equals(id)) {
                stationToUpdate = station;
                break;
            }
        }

        if (stationToUpdate != null) {
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();
            stationToUpdate.setName(newName);

            // Update other fields as needed

            System.out.println("Station updated successfully!");
        } else {
            System.out.println("Station not found with ID: " + id);
        }
    }

    public void deleteStation() {
        System.out.print("Enter station ID to delete: ");
        String id = scanner.nextLine();

        Station stationToDelete = null;
        for (Station station : stationList) {
            if (station.getId().equals(id)) {
                stationToDelete = station;
                break;
            }
        }

        if (stationToDelete != null) {
            stationList.remove(stationToDelete);
            System.out.println("Station deleted successfully!");
        } else {
            System.out.println("Station not found with ID: " + id);
        }
    }
}