package MoiDruzya.TicketOffice.api;

import java.util.List;

import MoiDruzya.TicketOffice.entity.TicketInfo;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateOrderRequestDto {
    private Long userId;
    private List<TicketInfo> infoList;
}
