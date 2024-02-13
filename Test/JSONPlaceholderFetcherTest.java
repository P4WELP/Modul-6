package JSONPlaceholderFetcher;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JSONPlaceholderFetcherTest {

    @Test
    void testAddPost() {
        JSONPlaceholderFetcher fetcher = new JSONPlaceholderFetcher();

        try {
            String newPost = "{ \"title\": \"Test post\", \"body\": \"This is a test post.\", \"userId\": 1 }";
            boolean success = fetcher.addPost(newPost);
            assertTrue(success, "Adding post should be successful");
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
}
