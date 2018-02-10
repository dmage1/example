package com.examples.mockito;

public class MyClass {
    private int uniqueId;
    private String thisString;

    int getUniqueId() {
        return uniqueId;
    }

    void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    void testing(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    void someMethod(String str) {
        this.thisString = thisString;
    }

}
