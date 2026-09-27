package utez.edu.mx.FibFiz.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin({"*"})
@RequestMapping("/tarea")
public class MyController {

    private String nombre = "Axel Sanchez Aldana Aragpn";

    public MyController() {
    }

    @GetMapping({"/fizzbuzz/{n}"})
    public String fizzBuzz(@PathVariable int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
        return nombre;

    }

    @GetMapping({"/fibonnacci/{n}"})
    public String fibonacci(@PathVariable int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(calculoFibonacci(i));
        }
        return nombre;
    }
    
    private int calculoFibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return calculoFibonacci(n - 1) + calculoFibonacci(n - 2);
    }
}
