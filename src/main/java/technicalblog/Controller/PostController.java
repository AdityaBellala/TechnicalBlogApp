package technicalblog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.post;
import technicalblog.service.Postservice;

import java.util.ArrayList;

@Controller
public class PostController {

    @Autowired
    private Postservice postService;

    @RequestMapping("posts")
    public String getUserPosts(Model model) {
        ArrayList<post> posts = postService.getOnePost();
        model.addAttribute("posts", posts);
        return "posts";
    }

}