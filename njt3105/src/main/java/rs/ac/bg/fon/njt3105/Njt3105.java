/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package rs.ac.bg.fon.njt3105;

import java.time.LocalDate;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import rs.ac.bg.fon.njt3105.config.AppConfig;
import rs.ac.bg.fon.njt3105.domain.Author;
import rs.ac.bg.fon.njt3105.domain.City;
import rs.ac.bg.fon.njt3105.domain.Publisher;
import rs.ac.bg.fon.njt3105.dto.BookDto;
import rs.ac.bg.fon.njt3105.service.BookDoesNotExistException;
import rs.ac.bg.fon.njt3105.service.BookExistException;
import rs.ac.bg.fon.njt3105.service.BookService;

/**
 *
 * @author natal
 */
@Component
public class Njt3105 {

    private final BookService jpaService;
    private final BookService hibernateService;

    @Autowired
    public Njt3105(@Qualifier("JpaBookService") BookService jpaService, @Qualifier("HibernateBookService") BookService hibernateService) {
        this.jpaService = jpaService;
        this.hibernateService = hibernateService;
    }

    public static void main(String[] args) {
        ApplicationContext ioc = new AnnotationConfigApplicationContext(AppConfig.class);
        Njt3105 app = ioc.getBean(Njt3105.class);
        app.run();
    }

    private void run() {
        System.out.println("pokrenuto");
        Scanner sc = new Scanner(System.in);
        int izbor = sc.nextInt();
        BookService service = switch (izbor) {
            case 1 ->
                jpaService;
            case 2 ->
                hibernateService;
            default ->
                throw new IllegalArgumentException("takav servis ne postoji");
        };
        
        int operacija = sc.nextInt();
        sc.nextLine();
        City city = new City(11000l, "Bg");
        Publisher p = new Publisher("123456", "a", "2222", city);
        Author a = new Author("nnata", "123", "Natalija", "Nikitovic", 2005);
        BookDto b = new BookDto(1l, "a", LocalDate.now(), 20000l, p, a);
        
        switch (operacija) {
            case 1->{
                try{
                    BookDto saved = service.save(b);
                    System.out.println("sacuvano "+ saved);
                }catch(BookExistException e){
                    System.out.println("greska " + e.getMessage() );
                }
            }
            case 2->{
            try{
                    service.delete(b);
                    System.out.println("sacuvana promena");
                }catch(BookDoesNotExistException e){
                    System.out.println("greska " + e.getMessage() );
                }
            }
            default->
                System.out.println("nije dobar izbor");
        }
    }
}
