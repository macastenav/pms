import services.*;
import java.util.Scanner;

public class PoliceManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PoliceService policeService = new PoliceService();
        StationService stationService = new StationService();
        ContractService contractService = new ContractService();
        TicketService ticketService = new TicketService();
        VehicleService vehicleService = new VehicleService();

        while (true) {
            System.out.println("\nPolice Management System");
            System.out.println("1. Police Operations");
            System.out.println("2. Station Operations");
            System.out.println("3. Contract Operations");
            System.out.println("4. Ticket Operations");
            System.out.println("5. Vehicle Operations");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int mainChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (mainChoice) {
                case 1:
                    policeOperationsMenu(policeService, scanner);
                    break;
                case 2:
                    stationOperationsMenu(stationService, scanner);
                    break;
                case 3:
                    contractOperationsMenu(contractService, scanner);
                    break;
                case 4:
                    ticketOperationsMenu(ticketService, scanner);
                    break;
                case 5:
                    vehicleOperationsMenu(vehicleService, scanner);
                    break;
                case 6:
                    System.out.println("Exiting system...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void policeOperationsMenu(PoliceService service, Scanner scanner) {
        while (true) {
            System.out.println("\nPolice Operations");
            System.out.println("1. Create Police");
            System.out.println("2. View All Polices");
            System.out.println("3. Update Police");
            System.out.println("4. Delete Police");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    service.createPolice();
                    break;
                case 2:
                    service.readAllPolices();
                    break;
                case 3:
                    service.updatePolice();
                    break;
                case 4:
                    service.deletePolice();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void stationOperationsMenu(StationService service, Scanner scanner) {
        while (true) {
            System.out.println("\nStation Operations");
            System.out.println("1. Create Station");
            System.out.println("2. View All Stations");
            System.out.println("3. Update Station");
            System.out.println("4. Delete Station");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    service.createStation();
                    break;
                case 2:
                    service.readAllStations();
                    break;
                case 3:
                    service.updateStation();
                    break;
                case 4:
                    service.deleteStation();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void contractOperationsMenu(ContractService service, Scanner scanner) {
        while (true) {
            System.out.println("\nContract Operations");
            System.out.println("1. Create Contract");
            System.out.println("2. View All Contracts");
            System.out.println("3. Update Contract");
            System.out.println("4. Delete Contract");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    service.createContract();
                    break;
                case 2:
                    service.readAllContracts();
                    break;
                case 3:
                    service.updateContract();
                    break;
                case 4:
                    service.deleteContract();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void ticketOperationsMenu(TicketService service, Scanner scanner) {
        while (true) {
            System.out.println("\nTicket Operations");
            System.out.println("1. Create Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. Update Ticket");
            System.out.println("4. Delete Ticket");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    service.createTicket();
                    break;
                case 2:
                    service.readAllTickets();
                    break;
                case 3:
                    service.updateTicket();
                    break;
                case 4:
                    service.deleteTicket();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void vehicleOperationsMenu(VehicleService service, Scanner scanner) {
        while (true) {
            System.out.println("\nVehicle Operations");
            System.out.println("1. Create Vehicle");
            System.out.println("2. View All Vehicles");
            System.out.println("3. Update Vehicle");
            System.out.println("4. Delete Vehicle");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    service.createVehicle();
                    break;
                case 2:
                    service.readAllVehicles();
                    break;
                case 3:
                    service.updateVehicle();
                    break;
                case 4:
                    service.deleteVehicle();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}