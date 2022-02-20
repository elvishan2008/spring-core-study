package me.springcore.magicdobby.springapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class BookService {

    BookRepsitory bookRepsitory;

    public void setBookRepsitory(BookRepsitory bookRepsitory) {
        this.bookRepsitory = bookRepsitory;
    }
}
