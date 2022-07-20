package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepositoy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepositoy bookRepositoy;

    public BookController(BookRepositoy bookRepositoy) {
        this.bookRepositoy = bookRepositoy;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookRepositoy.findAll());

        return "books";
    }
}
