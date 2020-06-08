package cqwu.jwy.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cqwu.jwy.auth.dao.UserDao;
import cqwu.jwy.auth.pojo.User;
import cqwu.jwy.auth.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
}
