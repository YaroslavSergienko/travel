package com.sym.tickets;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class DbSeeder implements CommandLineRunner {

    private TicketsRepository ticketsRepository;

    public DbSeeder(TicketsRepository ticketsRepository) {
        this.ticketsRepository = ticketsRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Ticket plaza = new Ticket(
                "8751200981",
                "8751200981",
                "2 hours",
                new Customer("Yaroslav", "Michael",
                        "Sergienko", "3328911945", "+" ),
                new Mail("22322", "yariksergienko1995@gmail.com"),
                new Cinema(
                        "Plaza",
                        "5th avenue",
                        Arrays.asList(
                                new Film( "The King-3", "fantasy", 18),
                                new Film( "Dear Jhon", "drama", 10),
                                new Film( "Smurphies", "cartoon", 0),
                                new Film( "Dolly", "soaper", 14)
                        )
                )
        );


        List<Ticket> tickets = Arrays.asList(plaza);
        this.ticketsRepository.save(tickets);
    }
}
