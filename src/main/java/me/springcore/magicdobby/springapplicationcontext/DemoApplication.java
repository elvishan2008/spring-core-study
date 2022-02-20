package me.springcore.magicdobby.springapplicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        String[] beanDefNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefNames));
        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println(bookService.bookRepsitory != null);
    }

}
