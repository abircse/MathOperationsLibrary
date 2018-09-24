package com.studioabir.mymath.abirmath;

public class abirmath {

    public static int Plus (int a, int b)
    {
        return a+b;
    }
    public static int Minus (int a, int b)
    {
        return a-b;
    }

    public static int Multiplication (int a, int b)
    {
        return a+b;
    }

    public static int Division (int a, int b)
    {
        if (b == 0)
        {
            throw new IllegalArgumentException("Division Not Support By 0 (Zero)");

        }
        else
        {
            return a/b;
        }

    }
}
