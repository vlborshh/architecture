package DZ4.Model;

import java.time.LocalDate;

import DZ4.Services.Customer;
import DZ4.Services.Ticket;

public class Bus {

    public Customer ind;
    public Ticket tick;

    public void buyingBusTicket() {
        Customer customer = new Customer(1);
        Ticket ticket = new Ticket(1, 2598.70, -1, LocalDate.now());
        this.ind = customer;
        this.tick = ticket;
    }

    @Override
    public String toString() {
        return "Покупатель с ID: " + ind.getId() +
                " купил билет под номером: " + tick.getRootNumber()
                + " по цене: " + tick.getPrice() + " от: " + tick.getDate();
    }

}
