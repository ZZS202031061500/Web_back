package com.zzs.contact_backend.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzs.contact_backend.entity.Contact;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContactMapper extends BaseMapper<Contact> {
}
