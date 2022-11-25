package dao;


import entity.User;

/**
 * 用户的dao接口的设计
 * @author Mryang
 *
 */
public interface UserDao {

    /**
     * 用户登录功能
     * @param username 参数  为用户名
     * @param password 参数 为密码
     * @return  user
     */
    User login(String username , String password);

}