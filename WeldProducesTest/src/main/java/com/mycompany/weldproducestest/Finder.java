package com.mycompany.weldproducestest;

import java.util.List;
import javax.inject.Inject;

public class Finder {

    @Inject
    @Lis
    private Lister lister;

    public List<Foo> getFoos() {
        return lister.getFooList();
    }
}
