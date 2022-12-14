package cn.edu.guet.youxuanapp.mapper;

import cn.edu.guet.youxuanapp.bean.SysRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Liwei
 * @Date 2021-08-13 17:50
 */
@Mapper
public interface SysRoleMapper {
    SysRole selectByPrimaryKey(Long id);
    List<SysRole> findAll();
}