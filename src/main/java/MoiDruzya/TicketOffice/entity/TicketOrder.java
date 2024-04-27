package MoiDruzya.TicketOffice.entity;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@Data
public class TicketOrder {

    // тут можно указать количество каких билетов выбирается?? adult, child, invalid
    @CreditCardNumber(message="Invalid credit card")
    private String ccNumber;
    @Pattern(regexp = "^(0[1-9]|1[0-2]) ([\\/])([2-9][0-9])$",
            message = "Must be formatted MM/YY")
    private String ссExpiration;
    @Digits(integer = 3, fraction = 0, message="Invalid CVV")
    private String ccCVV;

//    private List<Ticket> tickets = new ArrayList<>();
//
//    public void addTicket(Ticket ticket) {
//        this.tickets.add(ticket);
//    }
}
