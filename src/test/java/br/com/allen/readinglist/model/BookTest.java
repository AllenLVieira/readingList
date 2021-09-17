package br.com.allen.readinglist.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class BookTest {
    @Test
    void testConstructor() {
        Book actualBook = new Book("Allen", "978-8-85-417238-8", "O pequeno príncipe", "Antoine de Saint-Exupéry", "Um piloto cai com seu avião no deserto e ali encontra uma criança loura e frágil. Ela diz ter vindo de um pequeno planeta distante. E ali, na convivência com o piloto perdido, os dois repensam os seus valores e encontram o sentido da vida.");

        assertEquals("Antoine de Saint-Exupéry", actualBook.getAuthor());
        assertEquals("O pequeno príncipe", actualBook.getTitle());
        assertEquals("Allen", actualBook.getReader());
        assertEquals("978-8-85-417238-8", actualBook.getIsbn());
        assertNull(actualBook.getId());
        assertEquals("Um piloto cai com seu avião no deserto e ali encontra uma criança loura e frágil. Ela diz ter vindo de um pequeno planeta distante. E ali, na convivência com o piloto perdido, os dois repensam os seus valores e encontram o sentido da vida.", actualBook.getDescription());
    }
}

