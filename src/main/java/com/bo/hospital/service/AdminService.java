package com.bo.hospital.service;

import com.bo.hospital.pojo.Admin;

public interface AdminService {
    /**
     * 登录数据校验
     * */
    Admin login(int aId, String aPassword);
}
