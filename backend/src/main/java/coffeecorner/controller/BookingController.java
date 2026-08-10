package com.coffeecorner.controller;

import com.coffeecorner.model.Booking;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*")
public class BookingController {

    private final List<Booking> bookings = new ArrayList<>();

    @PostMapping
    public String createBooking(@RequestBody Booking booking) {

        bookings.add(booking);

        return "Booking successful!";
    }

    @GetMapping
    public List<Booking> getBookings() {

        return bookings;
    }

    @GetMapping("/{index}")
    public Booking getBooking(@PathVariable int index) {

        if (index < 0 || index >= bookings.size()) {
            return null;
        }

        return bookings.get(index);
    }

    @DeleteMapping("/{index}")
    public String deleteBooking(@PathVariable int index) {

        if (index < 0 || index >= bookings.size()) {
            return "Booking not found!";
        }

        bookings.remove(index);

        return "Booking deleted successfully!";
    }
}