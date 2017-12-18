package andy.tut.springboot.tiles.controller;

import andy.tut.springboot.tiles.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class DashboardController {

    @RequestMapping(value = {"/dashboard", "/", ""}, method = RequestMethod.GET)
    public String dashboard(Model model) {
        model.addAttribute("users", getUsers());
        return "dashboard";
    }

    private List<User> getUsers() {
        User user1 = new User();
        user1.setEmail("amitsingh@yahoo.com");
        user1.setName("Amit Singh");
        user1.setAddress("Chennai, Tamilnadu");
        User user2 = new User();
        user2.setEmail("bipulkumar@gmail.com");
        user2.setName("Bipul Kumar");
        user2.setAddress("Bangalore, Karnataka");
        User user3 = new User();
        user3.setEmail("prakashranjan@gmail.com");
        user3.setName("Prakash Ranjan");
        user3.setAddress("Chennai, Tamilnadu");
        User user4 = new User();
        user4.setEmail(new Date().getTime() + "@qq.com");
        user4.setName("北京人");
        user4.setAddress("Beijing");
        List<User> users = Arrays.asList(user1, user2, user3, user4);
        return users;
    }


}
