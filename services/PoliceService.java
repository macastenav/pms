package services;

import models.Police;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PoliceService {
    private List<Police> policeList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void createPolice() {
        System.out.println("Enter police details:");
        System.out.print("ID (Badge Number): ");
        String id = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Surname: ");
        String surname = scanner.nextLine();

        // Add more fields as needed

        Police police = new Police(id, name, surname);
        policeList.add(police);
        System.out.println("Police created successfully!");
    }

    public void readAllPolices() {
        System.out.println("All Polices:");
        for (Police police : policeList) {
            System.out.println(police);
        }
    }

    public void updatePolice() {
        System.out.print("Enter police ID to update: ");
        String id = scanner.nextLine();

        Police policeToUpdate = null;
        for (Police police : policeList) {
            if (police.getId().equals(id)) {
                policeToUpdate = police;
                break;
            }
        }

        if (policeToUpdate != null) {
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();
            policeToUpdate.setName(newName);

            // Update other fields as needed

            System.out.println("Police updated successfully!");
        } else {
            System.out.println("Police not found with ID: " + id);
        }
    }

    public void deletePolice() {
        System.out.print("Enter police ID to delete: ");
        String id = scanner.nextLine();

        Police policeToDelete = null;
        for (Police police : policeList) {
            if (police.getId().equals(id)) {
                policeToDelete = police;
                break;
            }
        }

        if (policeToDelete != null) {
            policeList.remove(policeToDelete);
            System.out.println("Police deleted successfully!");
        } else {
            System.out.println("Police not found with ID: " + id);
        }
    }
}