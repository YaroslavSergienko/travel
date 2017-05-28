package com.sym.api_gateway;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientTicketsJaxRs {

    public static void main(String[] args) {
        ClientTicketsJaxRs clientTicketsJaxRs = new ClientTicketsJaxRs();
        clientTicketsJaxRs.getAllTicketsJaxRs();
        clientTicketsJaxRs.sendEmailJaxRs();
    }


    private void sendEmailJaxRs() {
        try {

            Client client = Client.create();
            WebResource webResource2 = client.resource("http://localhost:8090/send-mail");
            ClientResponse response2 = webResource2.accept("application/json").get(ClientResponse.class);
            if (response2.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response2.getStatus());
            }

            String output2 = response2.getEntity(String.class);
            System.out.println("\n============sendEmailJaxRs============");
            System.out.println(output2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void getAllTicketsJaxRs() {
        try {

            Client client = Client.create();
            WebResource webResource2 = client.resource("http://localhost:8182/tickets/all");
            ClientResponse response2 = webResource2.accept("application/json").get(ClientResponse.class);
            if (response2.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response2.getStatus());
            }

            String output2 = response2.getEntity(String.class);
            System.out.println("\n============getAllTickets============");
            System.out.println(output2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
