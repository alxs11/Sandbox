package org.example.inheritance.association;

import java.awt.*;

public class Association {

    private String name;
    private Color color;
    private Dependency dependency;

    public Association(String name, Color color) {
        this.name = name;
        this.color = color;
    }
}
