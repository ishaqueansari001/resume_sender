package com.ishaque.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
    @Autowired
    public MailService mailService;

    @PostMapping("/send")
    String sendMail(@RequestBody String maildIds) throws Exception {
        String body="<!-- HTML Codes by Quackit.com -->\n" +
                "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>Text Example</title>\n" +
                "    <style>\n" +
                "        div.container {\n" +
                "            background-color: #ffffff;\n" +
                "        }\n" +
                "        div.container p {\n" +
                "            font-family: Arial;\n" +
                "            font-size: 14px;\n" +
                "            font-style: normal;\n" +
                "            font-weight: normal;\n" +
                "            text-decoration: none;\n" +
                "            text-transform: none;\n" +
                "            color: #000000;\n" +
                "            background-color: #ffffff;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <p>Hi,</p>\n" +
                "        <p>I have recently learned of your search for a <strong>Java Developer</strong>, and I have been inspired to submit my resume for consideration. As a <strong>Java Developer</strong> with experience of <strong>3.7 years</strong> in <strong>Core Java</strong>, Hibernate, <strong>Spring Boot</strong>, REST and <strong>MicroServices</strong>. I am positive I have the knowledge necessary to succeed in your organization.</p>\n" +
                "        <p>My professional experience includes working at Increasingly Pvt Ltd at Bangalore where I use my programming acumen to help them develop enterprise applications.</p>\n" +
                "        <p></p>\n" +
                "        <p>• Skills: <strong>Core Java Hibernate,Spring,Spring Boot, REST and MicroServices</strong></p>\n" +
                "        <p>• Tools: <strong> Maven, JIRA, GIT, Spring Boot, Docker, Kubernetes and Kafka</strong></p>\n" +
                "        <p></p>\n" +
                "        <p>Following are my career details:</p>\n" +
                "        <p></p>\n" +
                "        <p>• Total Experience- <strong>3.7 years</strong></p>\n" +
                "        <p>• Current CTC- 6.8 LPA</p>\n" +
                "        <p>• Notice Period- Immediate</p>\n" +
                "        <p>• Current Location- WFH (Parbhani)</p>\n" +
                "        <p></p>\n" +
                "        <p>Contact me at your earliest convenience if you would like to schedule an interview. Thanks for your consideration.</p>\n" +
                "        <p></p>\n" +
                "        <p>Regards,</p>\n" +
                "        <p>Mohammad Ishtiyaque Ahmed</p>\n" +
                "        <p>8975030717</p>\n" +
                "        <p></p>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";




        String[] to=maildIds.split(",");
        for(String id : to) {
            mailService.sendMail("ishtiyaque717@gmail.com",
                    id,
                    "Java Developer",
                    body);
        }
        return "success";
    }
}
