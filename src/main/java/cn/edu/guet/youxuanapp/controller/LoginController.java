package cn.edu.guet.youxuanapp.controller;

import cn.edu.guet.youxuanapp.bean.LoginBean;
import cn.edu.guet.youxuanapp.bean.SysUser;
import cn.edu.guet.youxuanapp.http.HttpResult;
import cn.edu.guet.youxuanapp.security.JwtAuthenticationToken;
import cn.edu.guet.youxuanapp.service.SysUserService;
import cn.edu.guet.youxuanapp.util.PasswordUtils;
import cn.edu.guet.youxuanapp.util.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private SysUserService sysUserService;

    @PostMapping("login")
    //public HttpResult login(String username,String password,HttpServletRequest request){
    public HttpResult login(@RequestBody LoginBean loginBean, HttpServletRequest request) throws IOException {
        String username = loginBean.getUsername();
        String password = loginBean.getPassword();

        System.out.println(username);

        System.out.println(password);

        // 用户信息
        SysUser user = sysUserService.findByName(username);
        // 账号不存在、密码错误
        if (user == null) {
            return HttpResult.error("账号不存在");
        }
        if (!PasswordUtils.matches(user.getSalt(), password, user.getPassword())) {
            return HttpResult.error("密码不正确");
        }
        // 账号锁定
        if (user.getStatus() == 0) {
            return HttpResult.error("账号已被锁定,请联系管理员");
        }
        // 系统登录认证
        JwtAuthenticationToken token = SecurityUtils.login(request, username, password, authenticationManager);
        System.out.println("token" + token);
        return HttpResult.ok(token);
    }
}
