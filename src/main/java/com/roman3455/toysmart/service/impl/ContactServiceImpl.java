package com.roman3455.toysmart.service.impl;

import com.roman3455.toysmart.dto.ContactRequestDto;
import com.roman3455.toysmart.entity.Contact;
import com.roman3455.toysmart.repository.ContactRepository;
import com.roman3455.toysmart.service.ContactService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public boolean saveContact(ContactRequestDto contactRequestDto) {
        try {
            Contact contact = mapToEntity(contactRequestDto);
            contact.setCreatedAt(Instant.now());
            contact.setCreatedBy(contactRequestDto.getName());
            contactRepository.save(contact);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private Contact mapToEntity(ContactRequestDto contactRequestDto) {
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactRequestDto, contact);
        return contact;
    }

}
