package com.keyilx.jni;

public class JNIDemo {
    static {
        /**
         * 静态加载jni库，另外还有动态加载方式
         * 这里jni_impl对应lib/libjni_impl.dylib("lib"+"jni_impl"+".dylib")
         */
        System.loadLibrary("jni_source");
    }

    //定义naive方法，返回String类型
    public native String getStringFromC();

    public static void main(String[] args) {
        JNIDemo jniDemo = new JNIDemo();
        //System.out.println(jniDemo.getStringFromC());
        while (true){
            System.out.println(jniDemo.getStringFromC());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

