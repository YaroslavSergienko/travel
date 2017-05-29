package com.sym.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    private Sender sender;

    @GetMapping("/send-mail")
    public Email sendEmail() {

//
//        sender.send("yariksergienko1995@gmail.com", "Tickets email",
//                "This is a mail which contains ibfo about your reservation ticket");

        System.out.println("Request from emailController.sendEmail received");

        Email email = new Email();

        return (Email) emailRepository.save(sender.send("yariksergienko1995@gmail.com", "Tickets email",
                "This is a mail which contains ibfo about your reservation ticket"));


    }
}
