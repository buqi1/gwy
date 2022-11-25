package util;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * 因为要使用类名[点]方法名称  所有 方法需要被静态化
 * @author Mryang
 * --------------------------------------------------------------------------------------
 * 反射的三种方式: 	1. Class.forName() 2. xxx对象.getClass(); 3. Xxx.class()
 * --------------------------------------------------------------------------------------
 *
 *
 */
public class JdbcUtil {

    private static String  driver ="com.mysql.cj.jdbc.Driver";// 数据库驱动类
    private static String  url ="jdbc:mysql://localhost:3306/usermanager?serverTimezone=UTC";// 数据库链接
    private static String  user ="root";// 数据库用户名
    private static String  password ="gwy123456";// 数据库密码

    // 权限修饰符  静态修饰符   返回值类型  方法名称
    /**
     * 获取链接的
     * @return conn
     */
    public static Connection getConnection() {

        try {
            //1. 类加载
            Class.forName(driver);
            //2. 驱动管理获取链接\三个参数\  接收
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
