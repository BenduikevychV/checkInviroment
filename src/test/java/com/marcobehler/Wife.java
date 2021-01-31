package com.marcobehler;

import java.util.List;

public class Wife {

    private String name;
    private List<Child> children;

    public Wife(String name, List<Child> children){
        this.name = name;
        this.children = children;
    }

    public String getName(){
        return name;
    }
    public List<Child> getChildren(){
        return children;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
