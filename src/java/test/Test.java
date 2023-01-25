/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Author;
import entities.Book;
import java.util.Date;
import service.AuthorService;
import service.BookService;
import util.HibernateUtil;

/**
 *
 * @author lenovo
 */
public class Test {

    public static void main(String[] args) {
        // HibernateUtil.getSessionFactory().openSession();
        AuthorService as = new AuthorService();
        BookService bs = new BookService();

//        as.create(new Author("ccc1","domin","Mick",new Date("2000/07/04")));
//        as.create(new Author("ccc2","Marhata","vikram",new Date("1996/07/04")));
        //as.create(new Author("ccc3","llll3","ffff3",new Date("1997/07/04")));
//        
//        bs.create(new Book("iii1","tttt1",new Date("1975/04/05"),as.getById(1)));
//        bs.create(new Book("iii2","tttt2",new Date("1985/04/05"),as.getById(2)));
//        bs.create(new Book("iii3","tttt3",new Date("1995/04/05"),as.getById(3)));
        
//          System.out.println(as.getAuthorByCin("ccc3"));
//          System.out.println(bs.getBooksByIsbn("iii3"));
//          System.out.println(bs.getBooksByAuthor(as.getById(2)));
        
        //System.out.println(bs.getBooksByDate(new Date("1985/02/05"), new Date("2020/05/05")));
    }
}
