package cn.edu.guet.youxuanapp.mapper;

import cn.edu.guet.youxuanapp.bean.SysMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Liwei
 * @Date 2021-08-13 17:50
 */
@Mapper
public interface SysMenuMapper {
    List<SysMenu> findAll();

    List<SysMenu> findByUserName(@Param(value = "userName") String userName);

    List<SysMenu> findChildrenByUserName(@Param(value = "userName") String userName);
}
