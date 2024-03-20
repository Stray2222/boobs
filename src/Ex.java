import java.util.List;

import static java.util.stream.Collectors.toList;

/*
 муня с книгами
 */
public class Ex {

    public static class Tag {
        String name;

        public Tag(String name) {

            this.name = name;
        }
    }

    public static class Book {
        String name;
        List<Tag> tags;

        public Book(String name, List<Tag> tags) {

            this.name = name;
            this.tags = tags;

        }
    }

    public static class Author {
        String id;
        String name;
        List<Book> books;

        public Author(String id, String name, List<Book> books) {
            this.id = id;
            this.name = name;
            this.books = books;
        }

    }

    public static List<Tag> getTagsOfAuthorsBooks(List<Author> authors, List<String> searchAuthorIds) {

        return authors.stream()
                //фильтрация авторов
                .filter(author -> searchAuthorIds.contains(author.id))
                //Преобразование потока авторов в поток книг
                .flatMap(author -> author.books.stream())
                // Также только в тег
                .flatMap(book -> book.tags.stream())
                .collect(toList());
    }
}
