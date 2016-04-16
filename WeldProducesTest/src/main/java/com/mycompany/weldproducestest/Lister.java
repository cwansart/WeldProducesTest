package com.mycompany.weldproducestest;

import java.util.List;
import javax.inject.Inject;

@Lis
public class Lister {

    @Inject
    private List<Foo> fooList;

    public List<Foo> getFooList() {
        return fooList;
    }
}
