package JSONPlaceholderFetcher;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        JSONPlaceholderFetcher fetcher = new JSONPlaceholderFetcher();

        try {
            System.out.println("Getting single post:");
            System.out.println(fetcher.getSinglePost(1));

            System.out.println("\nGetting all posts:");
            System.out.println(fetcher.getAllPosts());

            System.out.println("\nAdding a new post:");
            String newPost = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";
            boolean success = fetcher.addPost(newPost);
            System.out.println("Post added successfully: " + success);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}