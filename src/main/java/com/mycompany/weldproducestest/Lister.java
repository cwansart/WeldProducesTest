package com.mycompany.weldproducestest;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Lister {

    @Inject
    @FooFinder
    private Finder finder;

    public List<Foo> getFoos() {
        return finder.getFoos();
    }
}
