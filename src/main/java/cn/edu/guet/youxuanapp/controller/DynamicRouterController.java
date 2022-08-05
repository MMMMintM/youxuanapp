package cn.edu.guet.youxuanapp.controller;

import cn.edu.guet.youxuanapp.bean.DynamicRouter;
import cn.edu.guet.youxuanapp.http.HttpResult;
import cn.edu.guet.youxuanapp.service.DynamicRouterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * zt
 * 动态路由控制器
 */

@RestController
@RequestMapping("dynamicRouter")
public class DynamicRouterController {

    @Autowired
    private DynamicRouterService dynamicRouterService;

    @GetMapping(value = "/findNavRouter")
    public HttpResult findNaveRouter(@RequestParam String userName){
        System.out.println("查找动态路由" + userName);

        List<DynamicRouter> dynamicRouters = dynamicRouterService.findRouter(userName);

        System.out.println(dynamicRouters.toString());

        return HttpResult.ok(dynamicRouters);
    }
}
