package com.contactApp.services;

import com.contactApp.entities.Contact;
import com.contactApp.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public String saveContact(Contact contact) {

        if(contact.getContactId()!=null) {
            Contact savedContact = contactRepository.save(contact);
            return "contact saved";
        }else{
            return "contact failed to save";
        }

//        Contact savedcontact = contactRepository.save(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact getContactById(Integer contactId) {
        Optional<Contact> findById = contactRepository.findById(contactId);
        if(findById.isPresent()){
            return findById.get();
        }
        return null;
    }

    @Override
    public String updateContact(Contact contact) {
        if(contactRepository.existsById(contact.getContactId())){
            contactRepository.save(contact);
            return "update success";
        }else{
            return "no record found";
        }
    }

    @Override
    public String deleteContactById(Integer contactId) {
        if(contactRepository.existsById(contactId)){
            contactRepository.deleteById(contactId);
            return "Record deleted";
        }else{
            return "Record not found";
        }
    }
}
