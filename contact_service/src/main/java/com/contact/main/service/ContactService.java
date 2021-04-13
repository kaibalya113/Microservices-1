package com.contact.main.service;

import com.contact.main.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactService {

    //fake data
    List<Contact> contactList = List.of(
            new Contact(1l, "kaiba@gmail.com", "keishan mohaty", 190L),
            new Contact(2l, "kaiba@gmail.com", "keishan mohaty", 190L),
            new Contact(3l, "kaiba@gmail.com", "keishan mohaty", 190L),
            new Contact(4l, "kaiba@gmail.com", "keishan mohaty", 190L),
            new Contact(5l, "sagar@gmail.com", "sagar sharma", 193L),
            new Contact(6l, "sagar@gmail.com", "sagar sharma", 193L),
            new Contact(7l, "manas@gmail.com", "manas sahoo", 192L)


    );


    public List<Contact> getContactsForUser(Long userId){
        return this.contactList.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
