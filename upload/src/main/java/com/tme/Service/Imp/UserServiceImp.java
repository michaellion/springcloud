package com.tme.Service.Imp;

import com.tme.Bean.User;
import com.tme.Dao.UserDao;
import com.tme.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserDao ud;

    @Override
    public boolean login(@RequestParam("username") String username, @RequestParam("password") String password) {
        boolean flag = false;
        System.out.println("service" + username);
        if (ud.login(username, password) != null) {
            flag = true;
        }
        return flag;
    }
}
