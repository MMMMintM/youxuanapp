package cn.edu.guet.youxuanapp.controller;

import cn.edu.guet.youxuanapp.bean.SysMenu;
import cn.edu.guet.youxuanapp.http.HttpResult;
import cn.edu.guet.youxuanapp.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 菜单控制器
 *
 * @Author Liwei
 * @Date 2021-08-16 09:20
 */
@RestController
@RequestMapping("menu")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;

//    @PreAuthorize("hasAuthority('sys:menu:view')")
    @GetMapping(value = "/findNavTree")
    public HttpResult findNavTree(@RequestParam String userName) {
        System.out.println("查找菜单树：" + userName);
        List<SysMenu> sysMenus = sysMenuService.findTree(userName);
        for(int i = 0;i < sysMenus.size();i++)
        {
            sysMenus.get(i).setShow(false);
        }
        return HttpResult.ok(sysMenus);
    }

    @GetMapping(value = "/findChildrenTree")
    public HttpResult findChildrenTree(@RequestParam String userName){
        System.out.println("查找子菜单数：" + userName);
        List<SysMenu> sysMenus = sysMenuService.findChildrenTree(userName);
        return HttpResult.ok(sysMenus);
    }
}
