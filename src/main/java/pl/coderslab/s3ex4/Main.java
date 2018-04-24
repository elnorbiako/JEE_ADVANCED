package pl.coderslab.s3ex4;public class Main {

    public static void main(String[] args) {

        Observer fb1 = new FacebookObserver();
        Observer fb2 = new FacebookObserver();
        Observer tweet1 = new TweeterObserver();


        Post post = new Post("some title", "some text");

        post.attachObserver(fb1);

        post.savePost();
        post.updatePost();

        System.out.println("Add new observers");

        post.attachObserver(tweet1);
        post.attachObserver(fb2);

        post.savePost();
        post.updatePost();



    }

}
