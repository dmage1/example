package com.examples.mockito;

class ClassToTest {

    private MyDatabase myDatabase;

    ClassToTest(MyDatabase myDatabase) {
        this.myDatabase = myDatabase;
    }

    boolean query(String queryStr) {
        return this.myDatabase.query(queryStr);
    }
}
