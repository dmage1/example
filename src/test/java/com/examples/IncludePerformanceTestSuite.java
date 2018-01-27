package com.examples;

import com.examples.junit4.ClassA;
import com.examples.junit4.ClassB;
import com.examples.junit4.ClassC;
import com.examples.junit4.PerformanceTests;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Examples to run the categorized test cases: IncludeCategory
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(PerformanceTests.class)
//Include multiple categories
//@Categories.IncludeCategory({PerformanceTests.class, RegressionTests.class})
@Suite.SuiteClasses({ClassA.class, ClassB.class, ClassC.class})
public class IncludePerformanceTestSuite {
    //normally, this is an empty class
}
