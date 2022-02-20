package me.springcore.magicdobby.springapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    //@Qualifier("magicBookRepsitory")
    List<BookRepsitory> bookRepsitory;

    public void printBookRepository(){
        this.bookRepsitory.forEach(s -> System.out.println(s.getClass()));
        System.out.println(bookRepsitory.getClass());
    }
}
