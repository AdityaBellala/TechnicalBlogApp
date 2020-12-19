package technicalblog.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.post;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getallposts(Model model){

    post post1 = new post();
    post1.setTitle("Title 1");
    post1.setBody("Body of Title 1");
    post1.setDate(new Date());

    post post2 = new post();
    post2.setTitle("Title 2");
    post2.setBody("Body of Title 2");
    post2.setDate(new Date());

    post post3 = new post();
    post3.setTitle("Title 3");
    post3.setBody("Body of Title 3");
    post3.setDate(new Date());

    ArrayList<post> posts = new ArrayList<post>();
    posts.add(post1);
    posts.add(post2);
    posts.add(post3);

    model.addAttribute("posts",posts);

    return "index";

    }
}
