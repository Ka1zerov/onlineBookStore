package base.group.bookstore.service;

import base.group.bookstore.dto.BookDto;
import base.group.bookstore.dto.CreateBookRequestDto;
import java.util.List;

public interface BookService {
    BookDto save(CreateBookRequestDto bookDto);

    List<BookDto> getAll();

    BookDto getBookById(Long id);
}

