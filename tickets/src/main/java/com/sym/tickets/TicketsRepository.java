package com.sym.tickets;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketsRepository extends MongoRepository<Ticket, String>{
}
