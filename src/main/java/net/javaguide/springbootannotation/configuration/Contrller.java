package net.javaguide.springbootannotation.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
@RequestMapping("/api")
public class Contrller {

    @RequestMapping("/hello")
//    @ResponseBody
    public String control(){
        return " hello control";
    }

    @GetMapping (value = {"/book","/core-java","/java"})
//    @ResponseBody
    public BookConfig getBooks(){
        BookConfig bookConfig= new BookConfig(1,"Java  Programming","full detailing of java Programming");
        return bookConfig;
    }

    @PostMapping("/book/create")
//    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<BookConfig> createBook(@RequestBody BookConfig bookConfig){
        System.out.println(bookConfig.getId());
        System.out.println(bookConfig.getBookName());
        System.out.println(bookConfig.getDesc());
        return new ResponseEntity(bookConfig, HttpStatus.CREATED);
    }
    @PutMapping("/book/update/{id}")
    public ResponseEntity<BookConfig> updateBook(@PathVariable int id,@RequestBody BookConfig bookConfig){
        bookConfig.setId(id);
        System.out.println(bookConfig.getId());
        System.out.println(bookConfig.getBookName());
        System.out.println(bookConfig.getDesc());

        return ResponseEntity.ok(bookConfig);
    }
    @DeleteMapping(value = "/book/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id){
        System.out.println(id);
        return ResponseEntity.ok("Book object is deleted successfully");
    }
    @GetMapping("/book/{id}/{name}/{desc}")
    public ResponseEntity<BookConfig> pathVariable(@PathVariable int id,
                                                  @PathVariable("name") String bookName,
                                                   @PathVariable("desc") String bookDesc){
        System.out.println(id);
        BookConfig bookConfig= new BookConfig();
        bookConfig.setId(id);
        bookConfig.setBookName(bookName);
        bookConfig.setDesc(bookDesc);
        return ResponseEntity.ok(bookConfig);
    }
    @GetMapping("/book/query")
    public ResponseEntity<BookConfig> requestParamDemo(@RequestParam("id") int id,
                                                      @RequestParam("name") String name,
                                                       @RequestParam("desc") String desc){
        System.out.println(id);
        System.out.println(name);
        System.out.println(desc);
        BookConfig bookConfig= new BookConfig();
        bookConfig.setId(id);
        bookConfig.setBookName(name);
        bookConfig.setDesc(desc);
        return ResponseEntity.ok(bookConfig);
    }
}
