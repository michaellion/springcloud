package com.tme.Service;

import com.tme.Bean.User;
import com.tme.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public interface UserService {


    boolean login(String username, String password);

}
