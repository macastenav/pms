package services;

import models.Contract;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContractService {
    private List<Contract> contractList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void createContract() {
        System.out.println("Enter contract details:");
        System.out.print("ID: ");
        String id = scanner.nextLine();

        // You would need to get Police and Station references here
        // For simplicity, we'll just create with null references

        Contract contract = new Contract(id, null);
        contractList.add(contract);
        System.out.println("Contract created successfully!");
    }

    public void readAllContracts() {
        System.out.println("All Contracts:");
        for (Contract contract : contractList) {
            System.out.println(contract);
        }
    }

    public void updateContract() {
        System.out.print("Enter contract ID to update: ");
        String id = scanner.nextLine();

        Contract contractToUpdate = null;
        for (Contract contract : contractList) {
            if (contract.getId().equals(id)) {
                contractToUpdate = contract;
                break;
            }
        }

        if (contractToUpdate != null) {
            System.out.print("Enter new status (true/false): ");
            boolean newStatus = scanner.nextBoolean();
            contractToUpdate.setActive(newStatus);

            // Update other fields as needed

            System.out.println("Contract updated successfully!");
        } else {
            System.out.println("Contract not found with ID: " + id);
        }
    }

    public void deleteContract() {
        System.out.print("Enter contract ID to delete: ");
        String id = scanner.nextLine();

        Contract contractToDelete = null;
        for (Contract contract : contractList) {
            if (contract.getId().equals(id)) {
                contractToDelete = contract;
                break;
            }
        }

        if (contractToDelete != null) {
            contractList.remove(contractToDelete);
            System.out.println("Contract deleted successfully!");
        } else {
            System.out.println("Contract not found with ID: " + id);
        }
    }
}