package me.springcore.magicdobby.springapplicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public BookRepsitory bookRepsitory(){
        return new BookRepsitory();
    }

    @Bean
    public BookService bookService(){
        BookService bookService = new BookService();
        bookService.setBookRepsitory(bookRepsitory());
        return bookService;
    }
}
