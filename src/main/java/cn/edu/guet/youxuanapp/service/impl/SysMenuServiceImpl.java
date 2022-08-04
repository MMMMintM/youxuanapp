package cn.edu.guet.youxuanapp.service.impl;

import cn.edu.guet.youxuanapp.bean.SysMenu;
import cn.edu.guet.youxuanapp.mapper.SysMenuMapper;
import cn.edu.guet.youxuanapp.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Liwei
 * @Date 2021-08-13 18:12
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public List<SysMenu> findByUser(String userName) {
        if (userName == null || "".equals(userName) || "admin".equalsIgnoreCase(userName)) {
            return sysMenuMapper.findAll();
        }
        return sysMenuMapper.findByUserName(userName);
    }

    @Override
    public List<SysMenu> findTree(String userName) {
        List<SysMenu> sysMenus = new ArrayList<>();

        sysMenus = sysMenuMapper.findByUserName(userName);

        return sysMenus;
    }

    @Override
    public List<SysMenu> findChildrenTree(String userName) {
        List<SysMenu> childrenMenu = new ArrayList<>();

        childrenMenu = sysMenuMapper.findChildrenByUserName(userName);

        return childrenMenu;
    }

    //    private void findChildren(List<SysMenu> SysMenus, List<SysMenu> menus, int menuType) {
//        for (SysMenu SysMenu : SysMenus) {
//            List<SysMenu> children = new ArrayList<>();
//            for (SysMenu menu : menus) {
//                if (menuType == 1 && menu.getType() == 2) {
//                    // 如果是获取类型不需要按钮，且菜单类型是按钮的，直接过滤掉
//                    continue;
//                }
//                if (SysMenu.getId() != null && SysMenu.getId().equals(menu.getParentId())) {
//                    menu.setParentName(SysMenu.getName());
//                    menu.setLevel(SysMenu.getLevel() + 1);
//                    if (!exists(children, menu)) {
//                        children.add(menu);
//                    }
//                }
//            }
//            SysMenu.setChildren(children);
//            children.sort((o1, o2) -> o1.getOrderNum().compareTo(o2.getOrderNum()));
//            findChildren(children, menus, menuType);
//        }
//    }
//
//    private boolean exists(List<SysMenu> sysMenus, SysMenu sysMenu) {
//        boolean exist = false;
//        for (SysMenu menu : sysMenus) {
//            if (menu.getId().equals(sysMenu.getId())) {
//                exist = true;
//            }
//        }
//        return exist;
//    }
}
