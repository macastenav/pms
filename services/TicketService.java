package services;



import models.Ticket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketService {
    private List<Ticket> ticketList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void createTicket() {
        System.out.println("Enter ticket details:");
        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Person: ");
        String person = scanner.nextLine();

        System.out.print("Car Plates: ");
        String carPlates = scanner.nextLine();

        // Add more fields as needed

        Ticket ticket = new Ticket(id, person);
        ticketList.add(ticket);
        System.out.println("Ticket created successfully!");
    }

    public void readAllTickets() {
        System.out.println("All Tickets:");
        for (Ticket ticket : ticketList) {
            System.out.println(ticket);
        }
    }

    public void updateTicket() {
        System.out.print("Enter ticket ID to update: ");
        String id = scanner.nextLine();

        Ticket ticketToUpdate = null;
        for (Ticket ticket : ticketList) {
            if (ticket.getId().equals(id)) {
                ticketToUpdate = ticket;
                break;
            }
        }

        if (ticketToUpdate != null) {
            System.out.print("Enter new payment status (true/false): ");
            boolean newStatus = scanner.nextBoolean();
            ticketToUpdate.setPaid(newStatus);

            // Update other fields as needed

            System.out.println("Ticket updated successfully!");
        } else {
            System.out.println("Ticket not found with ID: " + id);
        }
    }

    public void deleteTicket() {
        System.out.print("Enter ticket ID to delete: ");
        String id = scanner.nextLine();

        Ticket ticketToDelete = null;
        for (Ticket ticket : ticketList) {
            if (ticket.getId().equals(id)) {
                ticketToDelete = ticket;
                break;
            }
        }

        if (ticketToDelete != null) {
            ticketList.remove(ticketToDelete);
            System.out.println("Ticket deleted successfully!");
        } else {
            System.out.println("Ticket not found with ID: " + id);
        }
    }
}