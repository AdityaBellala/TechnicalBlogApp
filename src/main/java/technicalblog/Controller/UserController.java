package technicalblog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.model.User;
import technicalblog.model.post;
import technicalblog.service.Postservice;

import java.util.ArrayList;

@Controller
public class UserController {
    @Autowired
    private Postservice postService;

    @RequestMapping("users/login")
    public String login() {
        return "users/login";
    }

    @RequestMapping("users/registration")
    public String registration() {
        return "users/registration";
    }

    @RequestMapping(value = "users/login", method= RequestMethod.POST)
    public String loginUser(User user) {
        return "redirect:/posts";
    }

    @RequestMapping(value = "users/logout", method= RequestMethod.POST)
    public String logout(Model model) {
        ArrayList<post> posts = postService.getAllPosts();

        model.addAttribute("posts",posts);
        return "index";
    }

}