package me.liuhu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 版      权:  江苏千米网络科技有限公司 <br>
 * 包      名:  me.liuhu.web.controller       <br>
 * 描      述:                        <br>
 * 创 建 人 :  LiuHu(OF1558)          <br>
 * 修改时间:  2015/5/22                  <br>
 */
@Controller
@RequestMapping("home")
public class HomeController {
    /**
     * 跳转到登录页面
     *
     * @return
     */
    @RequestMapping("index")
    public String toLoginView() {
        return "home/login";
    }

    @RequestMapping("success")
    public String success(HttpSession session) {

        try {
            String userName = session.getAttribute("userName").toString();
            System.out.print(userName);
            return "/home/success";
        }catch (Throwable t){
            return "redirect:https://www.baidu.com/login";
        }

    }

    @RequestMapping("login")
    public ModelAndView login(HttpServletRequest request,HttpServletResponse resp) {
        //resp.sendRedirect("");
        //request.getRequestDispatcher("").forward(request,null);
        ModelAndView mv=new ModelAndView("");
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        if ("liuhu".equals(userName) && "123".equals(passWord)){
            request.getSession().setAttribute("userName", userName);
            mv.setViewName("redirect:/home/success");
            System.out.print(userName + "  " + passWord);
        }else {
            mv.setViewName("forward:/home/index");
            mv.addObject("username",userName);
            mv.addObject("message", "username or password error ");
        }
        return mv;

    }

    @RequestMapping("loginOut")
    public String loginOut(HttpSession session) {
        session.removeAttribute("userName");
        return "home/login";
    }
}