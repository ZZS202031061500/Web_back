package com.zzs.contact_backend.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zzs.contact_backend.common.CommonResponse;
import com.zzs.contact_backend.common.Status;
import com.zzs.contact_backend.entity.Contact;
import com.zzs.contact_backend.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping
    public CommonResponse<List<Contact>> getContacts() {
        List<Contact> list = contactService.list();
        return new CommonResponse<>(Status.OK, list);
    }

    @GetMapping("/{id}")
    public CommonResponse<Contact> getContactByID(@PathVariable Long id) {
        Contact contact = contactService.getById(id);
        return new CommonResponse<Contact>(Status.OK, contact);
    }

    @DeleteMapping("/{id}")
    public CommonResponse<Boolean> deleteContactByID(@PathVariable Long id) {
        boolean isOk = contactService.removeById(id);
        return new CommonResponse<Boolean>(Status.OK, isOk);
    }

    @PutMapping
    public CommonResponse<Boolean> changeContact(@RequestBody Contact contact) {
        QueryWrapper<Contact> wrapper = new QueryWrapper<>();
        wrapper.eq("contact_id", contact.getContactId());
        boolean isOk = contactService.update(contact, wrapper);
        return new CommonResponse<Boolean>(Status.OK, isOk);
    }

    @PostMapping
    public CommonResponse<Boolean> addContact(@RequestBody Contact contact) {
        boolean isOk = contactService.save(contact);
        return new CommonResponse<Boolean>(Status.OK, isOk);
    }
}
