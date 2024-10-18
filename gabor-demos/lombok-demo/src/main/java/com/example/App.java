package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var p = Person.builder()
        .name("Jane Doe")
        .age(25)
        .address("123 Main St")
        .build(); 
        
        
        
        p.setName("John Doe");  


        var s = p.toString();
        System.out.println(p);
    }
}
