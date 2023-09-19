package DZ4.Services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private List<Ticket> tickets;
    private CashProvider cash;

    public Customer(int id) {
        this.id = id;
        this.tickets = new ArrayList<>();
        // this.cash = cash;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Ticket> getTickets() {
        return this.tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public CashProvider getCash() {
        return this.cash;
    }

    public void setCash(CashProvider cash) {
        this.cash = cash;
    }

    public boolean buyTicket(Ticket ticket) {
        if (cash != null) {
            cash.buy(ticket.getPrice());
            tickets.add(ticket);
            return true;
        } else {
            // Обработка ошибок
        }
        return false;
    }

    public List<Ticket> search(LocalDateTime dateTime, long id) {
        return new ArrayList<>();
    }

}
