package org.tel.ran.lesson14;

public class EDevice {}
class Mouse extends EDevice{}
class Keyboard extends EDevice{}
class Display extends EDevice{}
class Main{
    public static void main(String[] args) {
        EDevice mouse = new Mouse();
        EDevice keyboard = new Keyboard();
        new Main().show1(mouse);
        Object eDevice = new EDevice();
        Object ob = new Mouse();
        Integer x = 22;
        int a = 512;
        byte b = (byte) a;
        System.out.println(b);
    }
        public void show1(EDevice ob){
        System.out.println("ob = " + ob.getClass() + " " + ob.hashCode());
        }
}
