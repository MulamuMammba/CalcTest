package org.mammba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    private final Calculator calculator = new Calculator();

    @GetMapping("/")
    public String showCalculator() {
        return "calculator";
    }

    @PostMapping("/")
    public String calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operation,
            Model model) {

        System.out.println("num1: " + num1 + "\nnum2: " + num2 + "\noperator: " + operation);
        double result;
        switch (operation) {
            case "add":
                result = calculator.add(num1, num2);
                break;
            case "subtract":
                result = calculator.subtract(num1, num2);
                break;
            case "multiply":
                result = calculator.multiply(num1, num2);
                break;
            case "divide":
                result = num2 != 0 ? calculator.divide(num1, num2) : Double.NaN;
                break;
            default:
                result = 0;
        }

        model.addAttribute("result", result);
        return "calculator";
    }
}
