package com.mycompany.weldproducestest;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Produces;

public class FooCreator {

    @Produces
    public List<Foo> createFoos() {
        List<Foo> fooList = new ArrayList<>();
        fooList.add(new Foo());
        fooList.add(new Foo());
        fooList.add(new Foo());
        return fooList;
    }
}
