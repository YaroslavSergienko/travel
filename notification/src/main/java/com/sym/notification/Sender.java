package com.sym.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class Sender {

    @Autowired
    private JavaMailSender javaMailSender;

    public Email send(String to, String subject, String body) {

        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper;
        Email email = null;
        try {
            helper = new MimeMessageHelper(message, true);

            helper.setSubject(subject);
            helper.setTo(to);
            helper.setText(body, true);

            javaMailSender.send(message);

            email = new Email();
            email.setAdress(to);
            email.setBody(body);
            email.setTittle(subject);


        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return email;
    }
}
