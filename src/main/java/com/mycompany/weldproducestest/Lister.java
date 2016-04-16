package com.mycompany.weldproducestest;

import java.util.List;
import javax.inject.Inject;

public class Lister {

    @Inject
    @FooFinder
    private Finder finder;

    public List<Foo> getFoos() {
        return finder.getFoos();
    }
}
