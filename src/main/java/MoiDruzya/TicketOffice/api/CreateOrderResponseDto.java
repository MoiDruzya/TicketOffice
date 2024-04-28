package MoiDruzya.TicketOffice.api;

import java.util.Date;
import java.util.List;

import MoiDruzya.TicketOffice.entity.Ticket;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateOrderResponseDto {
    private Long id;
    private Date purchaseDate;
    private Double sum;
    private List<Ticket> tickets;
}

