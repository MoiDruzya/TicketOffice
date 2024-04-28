package MoiDruzya.TicketOffice.controllers;

import MoiDruzya.TicketOffice.service.TicketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketControllerImpl implements TicketController {
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String getTicketList(){
        return "/ticket/list";
    }
}
