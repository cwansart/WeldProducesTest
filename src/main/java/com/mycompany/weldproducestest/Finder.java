package com.mycompany.weldproducestest;

import java.util.List;
import javax.inject.Inject;

@FooFinder
public class Finder {
    
    @Inject
    private List<Foo> fooList;
    
    public List<Foo> getFoos() {
        return fooList;
    }
}
