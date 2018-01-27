package com.examples;

import com.examples.junit4.ClassA;
import com.examples.junit4.ClassB;
import com.examples.junit4.ClassC;
import com.examples.junit4.PerformanceTests;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Examples to run the categorized test cases: ExcludeCategory
 */
@RunWith(Categories.class)
@Categories.ExcludeCategory(PerformanceTests.class)
@Suite.SuiteClasses({ClassA.class, ClassB.class, ClassC.class})
public class ExcludePerformanceTestSuite {
}
