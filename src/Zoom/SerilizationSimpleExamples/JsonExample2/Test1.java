package Zoom.SerilizationSimpleExamples.JsonExample2;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Book book = new Book("xxx", "maks", 301, new Date());
        String result = mapper.writeValueAsString(book);
        System.out.println(result);
        String jsonString = """
                {
                  	"title" : "Джордж і незламний код",
                  	"author" : "Гокінґ Л., Гокінґ С.",
                  	"pages" : 320,
                  	"unknown property" : 42
                	}""";
        Book bookResult = mapper.readValue(jsonString, Book.class);
        System.out.println(book);
    }
}

//@JsonPropertyOrder({"createdDate"}) // порядок
//@JsonInclude(JsonInclude.Include.NON_NULL) //Тепер поля, які мають значення null, не серіалізувалися.
class Book {
    //@JsonIgnore //игнорит поле
    public String title;
    public String author;
    public int pages;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public Date createdDate = new Date();

    @JsonCreator
    public Book(@JsonProperty("title") String title, @JsonProperty("author") String author, @JsonProperty("pages") int pages, @JsonProperty("date") Date date) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.createdDate = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", createdDate=" + createdDate +
                '}';
    }
}
