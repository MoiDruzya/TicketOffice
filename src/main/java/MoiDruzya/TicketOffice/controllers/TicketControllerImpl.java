package MoiDruzya.TicketOffice.controllers;

import MoiDruzya.TicketOffice.service.TicketService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ticket")
public class TicketControllerImpl implements TicketController {
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String getTicketList(){
        return "/ticket/list";
    }
}
