package wordCount;
//using 'spring-boot-starter-web', create a web service with two endpoints:
//GET /hello: which returns "Hello" string as a response.
//POST /wordCount: this one should accept text in a body
// and mode (lines, characters, words) query parameter
// and return a number which is a result of count.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WordCount {
    public static void main(String[] args) {

       SpringApplication.run(WordCount.class, args);
    }
}
