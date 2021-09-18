package br.com.allen.readinglist.controller;

import br.com.allen.readinglist.model.Book;
import br.com.allen.readinglist.repository.ReadingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class ReadingListController {
    private ReadingListRepository readingListRepository;

    @Autowired
    public ReadingListController(ReadingListRepository readingListRepository){
        this.readingListRepository = readingListRepository;
    }



    @GetMapping("readinglist/{reader}")
    public String readersBook(@PathVariable("reader") String reader, Model model){
        List<Book> readingList = readingListRepository.findByReader(reader);
        if(readingList != null){
            model.addAttribute("books", readingList);
        }
        return "readinglist";
    }

    @PostMapping("readinglist/{reader}")
    public String addToReadingList(@PathVariable("reader") String reader, @Valid Book book, BindingResult result){
        if(!result.hasErrors()) {
            book.setReader(reader);
            readingListRepository.save(book);
        }
        return "redirect:/readinglist/{reader}";
    }
}
