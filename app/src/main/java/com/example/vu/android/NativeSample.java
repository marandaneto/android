package com.example.vu.android;

public class NativeSample {
    public static native void crash();

    static {
        System.loadLibrary("native-sample");
    }
}