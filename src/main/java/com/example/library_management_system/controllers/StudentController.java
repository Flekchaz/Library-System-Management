package com.example.library_management_system.controllers;

import com.example.library_management_system.services.LibraryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
@AllArgsConstructor
public class StudentController {

    private final LibraryService libraryService;

    @GetMapping("/data")
    public String initializeData(){
        libraryService.initializeData();
        return "Data handled successfully";

    }

}
