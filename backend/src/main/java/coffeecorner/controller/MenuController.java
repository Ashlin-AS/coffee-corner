package com.coffeecorner.controller;

import com.coffeecorner.model.Menu;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = "*")
public class MenuController {

    private final List<Menu> menuList = new ArrayList<>();

    public MenuController() {

        menuList.add(
            new Menu(
                1,
                "Espresso",
                "Hot Coffee",
                80,
                "Strong and rich espresso"
            )
        );

        menuList.add(
            new Menu(
                2,
                "Cappuccino",
                "Hot Coffee",
                120,
                "Creamy cappuccino with milk foam"
            )
        );

        menuList.add(
            new Menu(
                3,
                "Cold Coffee",
                "Cold Coffee",
                140,
                "Refreshing chilled coffee"
            )
        );

        menuList.add(
            new Menu(
                4,
                "Green Tea",
                "Tea",
                70,
                "Healthy and refreshing green tea"
            )
        );
    }

    @GetMapping
    public List<Menu> getMenu() {

        return menuList;
    }

    @GetMapping("/{id}")
    public Menu getMenuItem(@PathVariable int id) {

        for (Menu menu : menuList) {

            if (menu.getId() == id) {
                return menu;
            }
        }

        return null;
    }
}