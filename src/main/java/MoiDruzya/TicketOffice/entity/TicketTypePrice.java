package MoiDruzya.TicketOffice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketTypePrice {
    private TicketType ticketType;
    private Integer price;
}
