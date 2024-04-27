package MoiDruzya.TicketOffice.repository;

import MoiDruzya.TicketOffice.entity.Ticket;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class TicketRepositoryImpl implements TicketRepository {
    private final List<Ticket> tickets = new LinkedList<>();
}
