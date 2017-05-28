package com.sym.notification;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSendMail {

    @Autowired
    private Sender sender;

    @RequestMapping("/send-mail")
    public void sendMail(){

        sender.send("yariksergienko1995@gmail.com", "Celebrate diversity", "Ku-ku");
    }
}
