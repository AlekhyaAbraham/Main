package org.utilities;

public enum APIResources {

    /*
     * Here we make this class enum and enum is special class in java which has collection of the constants and methods.
     * Here in this class we are declared all the end points of the APIs.
     * */

    // Methods that return the resources end point for ASTPP.

    login("/api/login");



    // Variable that stores the resource value.
    private String resource;

    APIResources(String resource) {

        // Assign value to this class variable.
        this.resource = resource;
    }

    public String getResource()
    {
        return resource;
    }
}
