package me.getmanskii.budgetapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String helloWeb() {
        return "Приложение запущено!";
    }

    @GetMapping("/path/to/info")
    public String info(@RequestParam String name, String nameProject, Integer dateOfCreation, String description) {
        return "Имя ученика: " + name + " Название проекта: " + nameProject +
                " Дата создания проекта: " + dateOfCreation +
                " Описание проекта в свободной форме: " + description;
    }
}
