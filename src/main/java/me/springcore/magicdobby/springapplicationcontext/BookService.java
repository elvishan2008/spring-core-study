package me.springcore.magicdobby.springapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BookService {

    @Autowired
    //@Qualifier("magicBookRepsitory")
    BookRepsitory myBookRepository;

    @PostConstruct
    public void setup(){
        System.out.println(myBookRepository.getClass());
    }

}
