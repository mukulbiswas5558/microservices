package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts

    List<Contact> list = List.of(
            new Contact(1L, "mukul@gmail.com", "Mukul", 1311L),
            new Contact(2L, "sumit@gmail.com", "Sumit", 1311L),
            new Contact(3L, "raja@gmail.com", "Raja", 1312L),
            new Contact(4L, "sameer@gmail.com", "Sameer", 1314L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
