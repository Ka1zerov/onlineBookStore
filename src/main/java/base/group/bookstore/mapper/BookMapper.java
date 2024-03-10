package base.group.bookstore.mapper;

import base.group.bookstore.config.MapperConfig;
import base.group.bookstore.dto.BookDto;
import base.group.bookstore.dto.CreateBookRequestDto;
import base.group.bookstore.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto createBookRequestDto);
}

