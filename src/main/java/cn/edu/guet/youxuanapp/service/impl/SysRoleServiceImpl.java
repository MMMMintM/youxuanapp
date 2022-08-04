package cn.edu.guet.youxuanapp.service.impl;

import cn.edu.guet.youxuanapp.bean.SysRole;
import cn.edu.guet.youxuanapp.mapper.SysRoleMapper;
import cn.edu.guet.youxuanapp.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Liwei
 * @Date 2021-08-13 18:12
 */
@Service
public class SysRoleServiceImpl  implements SysRoleService {

	@Autowired
	private SysRoleMapper sysRoleMapper;

	@Override
	public List<SysRole> findAll() {
		return sysRoleMapper.findAll();
	}
	
}
