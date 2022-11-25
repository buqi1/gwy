package dao.impl;

import dao.UserDao;
import entity.User;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * userdao的实现类
 * @author Mryang
 *	调用 jdbc
 *
 *静态方法优于构造方法先执行
 *
 */
public class UserDaoImpl implements UserDao {


    @Override
    public User login(String username, String password) {
        User user = null;

        try {

            Connection con = JdbcUtil.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from  user  where username = '"+username+"'  and password = '"+password+"';");

            if(rs.next()) {

                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));

                System.out.println("userDao中的user的内容是" + user);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            return user;
        }


    }
}