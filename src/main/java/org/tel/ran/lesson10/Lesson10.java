package org.tel.ran.lesson10;

public class Lesson10 {
    public static void main(String[] args) {
        String s1 = "www";
        int a = 10;
        String s = String.valueOf(a);
        System.out.println("s = " + s + ", s1 = " + s1);

        System.out.println();
        String s2 = "www";
        String s3 = new String("www");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s1==s2 = " + (s1 == s2));
        System.out.println("s1==s3 = " + (s1 == s3));

        System.out.println("s1.equals(s3) = " + s1.equals(s3));

    }
}
