package com.mycompany.weldproducestest;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class UI {
    
    @Inject
    private List<Foo> fooList;

    public void start() {
        
        // This does not work!
        Lister lister = new Lister();

        try {
            lister.getFoos().stream().forEach(System.out::println);
        } catch (NullPointerException ex) {
            System.err.println("foosList is null");
        }
        
        // This does work!
        fooList.stream().forEach(System.out::println);
    }
}
