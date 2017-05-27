package com.sym.tickets;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Tickets")
public class Ticket {

    @Id
    private String id;
    private String code;
    private String duration;
    private Customer customer;
    private Mail email;
    private Cinema cinema;

    Ticket(String id, String code, String duration, Customer customer, Mail email, Cinema cinema) {
        this.id = id;
        this.code = code;
        this.duration = duration;
        this.customer = customer;
        this.email = email;
        this.cinema = cinema;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Mail getEmail() {
        return email;
    }

    public void setEmail(Mail email) {
        this.email = email;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }




    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ticket{");
        sb.append("id='").append(id).append('\'');
        sb.append(", code='").append(code).append('\'');
        sb.append(", duration='").append(duration).append('\'');
        sb.append(", customer=").append(customer);
        sb.append(", email=").append(email);
        sb.append(", cinema=").append(cinema);
        sb.append('}');
        return sb.toString();
    }
}
