package com.mycompany.weldproducestest;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class UI {

    @Inject
    private List<Foo> fooList;

    @Inject
    Lister lister;

    public void start() {

        // This does not work!
        Lister lister2 = new Lister();
        
        try {
            lister2.getFoos().stream().forEach(System.out::println);
        } catch (NullPointerException ex) {
            System.err.println("foosList is null");
        }

        // This does work!
        lister.getFoos().stream().forEach(System.out::println);
        fooList.stream().forEach(System.out::println);
    }
}
