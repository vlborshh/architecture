package DZ4.Services;

import java.util.ArrayList;
import java.util.List;

public class TicketProvider {
    public List<Ticket> getTicket(long rootNumber) {
        // реализация поиска билета по его номеру, после чего возвращаем найденные
        // билеты
        return new ArrayList<>();
    }

    public boolean updateTicketStatus(Ticket ticket) {
        // реализация изменения статуса билета. Если удачно возвращаем true, иначе false
        return true;
    }
}
