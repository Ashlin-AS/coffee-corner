package com.coffeecorner.controller;

import com.coffeecorner.model.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    private final List<Contact> contacts = new ArrayList<>();

    @PostMapping
    public String submitContact(@RequestBody Contact contact) {

        contacts.add(contact);

        return "Message sent successfully!";
    }

    @GetMapping
    public List<Contact> getContacts() {

        return contacts;
    }
}