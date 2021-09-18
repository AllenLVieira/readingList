package br.com.allen.readinglist.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "The reader of the book must be identified.")
    private String reader;

    @NotBlank(message = "The ISBN of the book must be identified.")
    @Pattern(message = "ISBN is invalid.", regexp = "^(?:ISBN(?:-13)?:?\\ )?(?=[0-9]{13}$|(?=(?:[0-9]+[-\\ ]){4})[-\\ 0-9]{17}$)97[89][-\\ ]?[0-9]{1,5}[-\\ ]?[0-9]+[-\\ ]?[0-9]+[-\\ ]?[0-9]$")
    private String isbn;

    @NotBlank(message = "The title of the book must be identified.")
    private String title;

    @NotBlank(message = "The author of the book must be identified.")
    private String author;

    @NotBlank(message = "The book description must be identified.")
    private String description;

    public Book(String reader, String isbn, String title, String author, String description) {
        this.reader = reader;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.description = description;
    }
}
