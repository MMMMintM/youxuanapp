package cn.edu.guet.youxuanapp.service;

import cn.edu.guet.youxuanapp.bean.DynamicRouter;

import java.util.List;

/**
 * zt
 */
public interface DynamicRouterService {
    /**
     * 根据用户名查询路由表
     * @param userName
     * @return
     */
    List<DynamicRouter> findRouter(String userName);
}
