package pl.coderslab.d2ex1;

import pl.coderslab.s3ex4.Post;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {



    List<Post> posts = new ArrayList<>();
        posts.add(new Post("post1","text1"));
        posts.add(new Post("post2","text2"));
        posts.add(new Post("post2","text22"));
        posts.add(new Post("post3","text3"));


        printList(posts, post -> post.getTitle().equals("post2"));

}

        static <T > void printList (List < T > src, Filter < T > f){
            for (T s : src) {
                if (f.check(s)) {
                    System.out.println(s);
                }
            }
        }

}
