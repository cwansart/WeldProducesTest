package com.mycompany.weldproducestest;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Produces;

public class Foo {

    @Produces
    public List<Foo> createFoo() {
        List<Foo> fooList = new ArrayList<>();
        fooList.add(new Foo());
        fooList.add(new Foo());
        fooList.add(new Foo());
        return fooList;
    }
}
