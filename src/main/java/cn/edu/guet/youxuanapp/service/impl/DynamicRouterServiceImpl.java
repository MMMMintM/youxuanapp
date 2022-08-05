package cn.edu.guet.youxuanapp.service.impl;

import cn.edu.guet.youxuanapp.bean.DynamicRouter;
import cn.edu.guet.youxuanapp.mapper.RouterMapper;
import cn.edu.guet.youxuanapp.service.DynamicRouterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DynamicRouterServiceImpl implements DynamicRouterService {
    @Autowired
    private RouterMapper routerMapper;

    @Override
    public List<DynamicRouter> findRouter(String userName) {

        List<DynamicRouter> dynamicRouters = new ArrayList<>();

        dynamicRouters = routerMapper.findDynamicRouterByName(userName);

        return dynamicRouters;
    }
}
