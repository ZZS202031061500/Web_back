package com.zzs.contact_backend;

import com.zzs.contact_backend.dao.ContactMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ContactBackendApplicationTests {
    @Resource
    private ContactMapper contactMapper;

    @Test
    void contextLoads() {
        System.out.println(contactMapper.selectById(4));
    }

}
