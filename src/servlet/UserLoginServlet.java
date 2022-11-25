package servlet;


import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserLoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /*
         * 1 set encoding
         */
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");

        /*
         * 2. get 前台  的  参数
         */
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        /*
         * 3. 将获取到的用户名和密码传递给 userService
         */
        UserService userService = new UserServiceImpl();

        User u = userService.userLogin(username, password);

        if(u != null){
            response.getWriter().write("您的用户名或密码有误，请检查！");
            response.setHeader("Refresh", "5;Url="+ request.getContextPath());
        }else{
            request.setAttribute("mark", "用户登录成功！");
            request.getRequestDispatcher("/message.jsp").forward(request, response);
        }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet( request,  response);
    }

}