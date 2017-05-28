package com.sym.tickets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketsController {

    private TicketsRepository ticketsRepository;

    public TicketsController(TicketsRepository ticketsRepository) {
        this.ticketsRepository = ticketsRepository;
    }

    @GetMapping("/all")
    public List<Ticket> getAll(){

        System.out.println("Request from tickets received");
        return this.ticketsRepository.findAll();

    }
}
