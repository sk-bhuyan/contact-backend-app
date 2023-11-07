package com.contactApp.controller;

import com.contactApp.entities.Contact;
import com.contactApp.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/contact")
    public String createContact(@RequestBody Contact contact){
        String s = contactService.saveContact(contact);
        return s;
    }

    @GetMapping("/contacts")
    public List<Contact> getAllContacts(){
        List<Contact> allContacts = contactService.getAllContacts();
        return allContacts;
    }

    @GetMapping("/contact/{contactId}")
    public Contact getContactById(@PathVariable Integer contactId){
        Contact contactById = contactService.getContactById(contactId);
        return contactById;
    }

    @PutMapping("/contact")
    public String updateContact(@RequestBody Contact contact){
        String s = contactService.updateContact(contact);
        return s;
    }

    @DeleteMapping("/contact/{contactId}")
    public String deleteContact(@PathVariable Integer contactId){
        String s = contactService.deleteContactById(contactId);
        return s;
    }
}
