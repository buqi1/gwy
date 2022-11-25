package service.impl;


import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.User;
import service.UserService;

public class UserServiceImpl implements UserService {

    // 采用多态的形式进行实例化dao
    UserDao dao = new UserDaoImpl();

    @Override
    public User userLogin(String username, String password) {
        //dao代表的是UserDao 这个接口
//		.login  用这个接口中的用户登录功能  并且传了两个参数给你
        return dao.login(username, password);
    }

}