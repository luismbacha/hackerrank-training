// https://www.hackerrank.com/challenges/java-singleton/problem


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    private Singleton() {}
    public String str;
    private static Singleton instance;
    public static Singleton getSingleInstance() {
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}