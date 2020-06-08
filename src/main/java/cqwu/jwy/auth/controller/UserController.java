package cqwu.jwy.auth.controller;

import cqwu.jwy.auth.pojo.User;
import cqwu.jwy.auth.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("用户操作接口")
@RestController
@RequestMapping("user")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = "创建用户")
    @ApiImplicitParam(name = "user", value = "用户数据", required = true, paramType = "body", dataType = "User")
    @PostMapping("add")
    public String createUser(@RequestBody User user) {
        userService.save(user);
        return user.toString();
    }

}
