# Interview Project
This project is created to test java developers

## Overview
There are several sections; java core questions, code reviews and code writing.

### Getting Started
Everything that is need to run or configure the project is checked into project.  You will need internet access to maven for this to work.
To do your first build:

    ./gradlew jar
    or
    ./gradlew.bat jar

To configure an editor:

    ./gradlew idea
    or
    ./gradlew eclipse

To run tests:

    ./gradlew test

To review output of tests:

    ./gradlew test -i

### Questions
DoubleQuestion

         double value = 2.0 - 1.1;
         System.out.println("value = " + value);

1. What is the expected result?
2. What did you get and why?
3. How do you fix it?

NumOfArraysQuestion

1. What is the expected result?
2. What is the result?
3. Why?  - In great detail :)

StringCompareExample

1. What is the expected result or 1, 2 and 3?
2. What is the result?
3. Why?  - In great detail :)

(Extra Credit)
When considering Java's generics, what does the term reified mean?  And what effect does it have on the Java?

### Code Reviews
The class Weight represents code that was developed for a client in 2010 for which I was to give a code review...

1. What is your review?

### Code Writing
1. The project contains a Person class which contains a getFullName() method.  Complete the PersonTest class to test this method.
2. The StringUtils class has a StringUtilsSpec Test which is currently failing.  Fix the StringUtils to be a good implementation.
