package base.group.online_book_store.service;

import base.group.online_book_store.model.Book;

import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> getAll();
}
