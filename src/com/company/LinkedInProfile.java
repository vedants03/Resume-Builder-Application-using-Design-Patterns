package com.company;

public class LinkedInProfile implements Component{
    String linkedIn;

    public LinkedInProfile(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    @Override
    public void addComponent(Component c) {

    }

    @Override
    public void removeComponent(Component c) {

    }

    @Override
    public String componentName() {
        return null;
    }

    @Override
    public String displayComponent() {
        return linkedIn;
    }
}
