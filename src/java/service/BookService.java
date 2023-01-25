/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.IDao;
import entities.Author;
import entities.Book;
import entities.Book;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author lenovo
 */
public class BookService implements IDao<Book> {

    @Override
    public boolean create(Book o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
            return true;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return false;
    }
    
       @Override
    public boolean delete(Book o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.delete(o);
            tx.commit();
            return true;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public Book getById(int id) {
        Session session = null;
        Transaction tx = null;
        Book b = new Book();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            b = (Book) session.get(Book.class, id);
            tx.commit();
            return b;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return b;
    }

    public List<Book> getBooksByIsbn(String isbn) {
        Session session = null;
        Transaction tx = null;
        List<Book> a = new ArrayList<>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            a = session.createQuery("select b from Book b where b.isbn = :isbn").setParameter("isbn", isbn).list();
            tx.commit();
            return a;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return a;
    }

    public List<Book> getBooksByAuthor(Author a) {
        Session session = null;
        Transaction tx = null;
        List<Book> books = new ArrayList<>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            books = session.createQuery("select b from Book b where b.author = :a").setParameter("a", a).list();
            tx.commit();
            return books;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return books;
    }

    public List<Book> getBooksByDate(Date d1, Date d2) {
        Session session = null;
        Transaction tx = null;
        List<Book> books = new ArrayList<>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            books = session.createQuery("select b from Book b where b.editionDate between :d1 and :d2").setParameter("d1", d1).setParameter("d2",d2).list();
            tx.commit();
            return books;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return books;
    }
    
        public List<Book> getAllBooks() {
        Session session = null;
        Transaction tx = null;
        List<Book> a = new ArrayList<>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            a = session.createQuery("from Book").list();
            tx.commit();
            return a;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return a;
    }
}
