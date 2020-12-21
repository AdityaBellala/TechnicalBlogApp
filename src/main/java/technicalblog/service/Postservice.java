package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.model.post;

import java.util.ArrayList;
import java.util.Date;

@Service
public class Postservice {

    public ArrayList<post> getAllPosts() {
        ArrayList<post> posts = new ArrayList<>();

        post post1 = new post();
        post1.setTitle("Post 1");
        post1.setBody("Post Body 1");
        post1.setDate(new Date());

        post post2 = new post();
        post2.setTitle("Post 2");
        post2.setBody("Post Body 2");
        post2.setDate(new Date());

        post post3 = new post();
        post3.setTitle("Post 3");
        post3.setBody("Post Body 3");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }

    public ArrayList<post> getOnePost() {
        ArrayList<post> posts = new ArrayList<>();

        post post1 = new post();
        post1.setTitle("This is your Post");
        post1.setBody("This is your Post. It has some valid content");
        post1.setDate(new Date());
        posts.add(post1);

        return posts;

    }


}
