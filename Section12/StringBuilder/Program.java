package Section12.StringBuilder;

import Section12.StringBuilder.entities.Comment;
import Section12.StringBuilder.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    void main() {
        Comment comment1 = new Comment("Have a nice trip.");
        Comment comment2 = new Comment("Wow that's awesome!");
        Comment comment3 = new Comment("Good night.");
        Comment comment4 = new Comment("May the Force be with you!");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime date1 = LocalDateTime.parse("21/06/2018 13:05:44", dateTimeFormatter);
        LocalDateTime date2 = LocalDateTime.parse("28/07/2018 23:14:44", dateTimeFormatter);

        Post post1 = new Post(date1, "Traveling to New Zeland", "I'm going to visit this wonderful country!", 12);
        post1.addComment(comment1);
        post1.addComment(comment2);
        Post post2 = new Post(date2, "Good night guys", "See you tomorrow!", 5);
        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.println(post1);
        System.out.println();
        System.out.println(post2);
    }
}