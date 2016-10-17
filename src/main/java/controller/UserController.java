package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

/**
 * Created by Aleksey on 04.10.2016.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping (value="/user" , method= RequestMethod.POST)
    public @ResponseBody User save(@RequestBody User jsonString) {

        User user=UserService.addUser(jsonString);
        return user;
    }


}
