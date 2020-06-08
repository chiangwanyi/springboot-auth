package cqwu.jwy.auth.controller;

//@Api("用户操作接口")
//@RestController
//@RequestMapping("/user")
//public class UserController {
//
//    private UserService userService;
//
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
//
//    @ApiOperation(value = "创建用户")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "name", value = "姓名", required = true, dataType = "String"),
//            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String"),
//            @ApiImplicitParam(name = "age", value = "年龄", required = true, dataType = "Integer"),})
//    @PostMapping("add")
//    public String createUser(@RequestBody User user) {
//        userService.save(user);
//        return user.toString();
//    }
//}
