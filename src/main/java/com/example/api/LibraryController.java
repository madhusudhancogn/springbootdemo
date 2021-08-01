package com.example.api;

import com.example.dao.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    @Autowired
    LibraryRepository repository;

    @GetMapping("/getBooks/{id}")
    public Databasedemo getBooksById(@PathVariable(value="id")String id)
    {
        Databasedemo lib = repository.findById(id).get();
        return lib;
    }
}
