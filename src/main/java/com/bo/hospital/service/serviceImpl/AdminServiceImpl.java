package com.bo.hospital.service.serviceImpl;

import com.bo.hospital.mapper.AdminMapper;
import com.bo.hospital.pojo.Admin;
import com.bo.hospital.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("AdminService")
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    /**
     * 登录数据校验
     * */
    @Override
    public Admin login(int aId, String aPassword){
        Admin admin = this.adminMapper.selectById(aId);
        if (admin == null) {
            return null;
        }
        if (!(admin.getAPassword()).equals(aPassword)) {
            return null;
        }
        return admin;
    }



}
