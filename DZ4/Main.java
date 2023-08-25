package DZ4;

import java.time.LocalDate;

import DZ4.Services.Customer;
import DZ4.Services.Ticket;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1);
        Ticket ticket = new Ticket(1, 2598.70, -1, LocalDate.now());
        System.out
                .println("Покупатель с ID: " + customer.getId() + " купил билет с номером: " + ticket.getRootNumber()
                        + " по цене: " + ticket.getPrice() + " от: " + ticket.getDate());
    }
}
