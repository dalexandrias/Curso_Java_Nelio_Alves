package application;

import entities.Comment;
import entities.Post;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");
        Comment c3 = new Comment("Goode night");
        Comment c4 = new Comment("May the Force be with you");

        Post postTraveling = new Post(
                new Date(), "Traveling to New Zealand",
                "I'm going to visit this wonderful country!", 12
        );

        postTraveling.addComment(c1);
        postTraveling.addComment(c2);

        System.out.println(postTraveling);

        Post postGoodNight = new Post(
                new Date(), "Good night guys", "See you tomorrow", 5
        );

        postGoodNight.addComment(c3);
        postGoodNight.addComment(c4);

        System.out.println(postGoodNight);
    }
}

