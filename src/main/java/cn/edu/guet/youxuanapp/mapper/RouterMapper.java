package cn.edu.guet.youxuanapp.mapper;

import cn.edu.guet.youxuanapp.bean.DynamicRouter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * zt
 */
@Mapper
public interface RouterMapper {
    List<DynamicRouter> findDynamicRouterByName(@Param(value = "userName") String userName);
}
