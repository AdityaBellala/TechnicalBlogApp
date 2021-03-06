package technicalblog.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.post;
import technicalblog.service.Postservice;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @Autowired
    private Postservice postservice;
    @RequestMapping("/")
    public String getallposts(Model model){
        ArrayList<post> posts = postservice.getAllPosts();

    model.addAttribute("posts",posts);

    return "index";

    }
}
