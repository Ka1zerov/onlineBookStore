package base.group.bookstore.service;

import base.group.bookstore.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> getAll();
}
