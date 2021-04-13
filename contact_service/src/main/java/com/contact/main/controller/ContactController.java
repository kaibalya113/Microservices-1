package com.contact.main.controller;

import com.contact.main.model.Contact;
import com.contact.main.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("user/{id}")
    public List<Contact> getContactList(@PathVariable("id") Long id){
        return contactService.getContactsForUser(id);
    }

}
