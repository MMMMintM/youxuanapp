package cn.edu.guet.youxuanapp.service;

import cn.edu.guet.youxuanapp.bean.SysMenu;

import java.util.List;


/**
 * 菜单管理
 *
 * @Author Liwei
 * @Date 2021-08-14 18:05
 */
public interface SysMenuService {
    /**
     * 根据用户名查找菜单列表
     *
     * @param userName
     * @return
     */
    List<SysMenu> findByUser(String userName);

    /**
     * 查询菜单树,用户ID和用户名为空则查询全部
     *
     * @param userName
     * @return
     */
    List<SysMenu> findTree(String userName);

    List<SysMenu> findChildrenTree(String userName);
}
