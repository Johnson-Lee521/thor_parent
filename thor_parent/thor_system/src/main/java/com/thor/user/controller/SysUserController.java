package com.thor.user.controller;

import com.thor.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName SysUserController
 * @Description: 用户相关
 * @Author: Thor-911
 * @Date 2021/2/1
 **/
@RestController
@RequestMapping("/user")
@Api(tags="用户相关接口")
public class SysUserController {


    public Result userLogin(){
        return null;
    }

}
