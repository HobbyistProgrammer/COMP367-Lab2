package com.comp303.assignment1;

/**
 * Author: Benton Le
 * Student #: 301 174 103
 * Professor: Vivek Ahuja
 * Course: COMP303 - 401
 * Assignment: Assignment1
 * Date: 02-03-2024
 */

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

	@GetMapping("/")
	public String home(Model model) {
        // Get the current hour of the day
        int currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        // Generate a greeting based on the time
        String greeting = generateGreeting(currentHour);

        // Get the current time
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(Calendar.getInstance().getTime());

        // Pass the greeting and current time to the Thymeleaf template
        model.addAttribute("greeting", greeting);
        model.addAttribute("currentTime", currentTime);

        return "index";
    }

    private String generateGreeting(int hour) {
        String greeting;

        if (hour >= 5 && hour < 12) {
            greeting = "Good Morning";
        } else if (hour >= 12 && hour < 18) {
            greeting = "Good Afternoon";
        } else {
            greeting = "Good Evening";
        }

        return greeting;
    }
}
