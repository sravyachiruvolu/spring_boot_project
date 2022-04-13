package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class sampleproj {
    @GetMapping("/")
    public String index()
    {
      return "Spring boot environment";
    }
    @GetMapping("/test")
    public String test()
    {
      return "Testing boot Application";
    }
    @GetMapping("/Factorialofnum/{num}")
    public int Factorialofnum(@PathVariable int num)
    {
      int fact=1;    
        for(int i=1;i<=num;i++){    
            fact=fact*i;    
        }    
       return fact;
    }  
  }
 
