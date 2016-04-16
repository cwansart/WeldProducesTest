package com.mycompany.weldproducestest;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class UI {
    
    @Inject
    private List<Foo> fooList;

    public void start() {
        Finder finder = new Finder();

        try {
            finder.getFoos().stream().forEach(System.out::println);
        } catch (NullPointerException ex) {
            System.err.println("No foos (NULL)");
        }
        
        // This DOES work
        fooList.stream().forEach(System.out::println);
    }
}