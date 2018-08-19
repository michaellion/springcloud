package com.tme.Controller;

import com.tme.Bean.FileBean;
import com.tme.Controller.FileOperation.FileUtil;
import com.tme.Service.Imp.UserServiceImp;
import com.tme.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class loginController {

    @Autowired
    UserServiceImp userServiceImp;
    @Autowired
    FileUtil fileUtil;

    @RequestMapping("/")
    public String page() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {

        if (userServiceImp.login(username, password)) {
            List<FileBean> lists = fileUtil.getRootFile();
            model.addAttribute("lists", lists);
            return "main";
        } else {
            return "error";
        }
    }
}
