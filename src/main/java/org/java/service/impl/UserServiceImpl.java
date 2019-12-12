package org.java.service.impl;

import org.java.entity.SysUser;
import org.java.mapper.SysUserMapper;
import org.java.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public SysUser getUserList(Integer id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public SysUser login(SysUser user) {
		return sysUserMapper.login(user);
		
	}
	
	
	
}
