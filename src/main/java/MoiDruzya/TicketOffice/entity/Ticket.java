package MoiDruzya.TicketOffice.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private Long id;
    private Integer quantity;
    private TicketType ticketType;
}
