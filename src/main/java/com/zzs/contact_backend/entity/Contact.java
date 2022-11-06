package com.zzs.contact_backend.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("contact_table")
@CrossOrigin
public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId
    private Long contactId;
    @TableField("contact_name")
    private String contactName;
    @TableField("contact_phone")
    private String contactPhone;
    @TableField("contact_birthday")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date contactBirthday;
    @TableField("contact_sex")
    private String sex;
}