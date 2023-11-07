package com.contactApp.services;

import com.contactApp.entities.Contact;

import java.util.List;

public interface ContactService {
    public String saveContact(Contact contact);

    public List<Contact> getAllContacts();

    public Contact getContactById(Integer contactId);

    public String updateContact(Contact contact);

    public String deleteContactById(Integer contactId);
}
