package com.mycompany.weldproducestest;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class App 
{
    public static void main( String[] args )
    {
        Weld weld = new Weld();
        
        WeldContainer container = weld.initialize();
        
        // This DOES NOT work
        UI ui = container.select(UI.class).get();
        ui.start();
        
        // This DOES work 
        Finder finder = container.select(Finder.class).get();
        finder.getFoos().stream().forEach(System.out::println);
        
        container.shutdown();
    }
}
