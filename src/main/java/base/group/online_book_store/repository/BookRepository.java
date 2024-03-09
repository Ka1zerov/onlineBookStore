package base.group.online_book_store.repository;

import base.group.online_book_store.model.Book;

import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
