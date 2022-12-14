package cn.edu.guet.youxuanapp.service;

import cn.edu.guet.youxuanapp.bean.SysRole;

import java.util.List;


/**
 * 角色管理
 *
 * @Author Liwei
 * @Date 2021-08-13 18:04
 */
public interface SysRoleService {

    /**
     * 查询全部
     *
     * @return
     */
    List<SysRole> findAll();

}
