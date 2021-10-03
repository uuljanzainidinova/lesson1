package com.company;

public class Main {

    public static void main(String[] args) {

        ClassB objectA = new ClassB(23,"name1 ", Enum.GUN);
        ClassC objectB = new ClassC(45, "name2 ",Enum.KNIFE);
        ClassC objectC = new ClassC(40, "name3", Enum.KNIFE);

        System.out.println(objectA.getHealth()+" "+objectA.getName()+" "+objectA.getAnEnum());
        System.out.println(objectB.getHealth()+" "+objectB.getName()+" "+objectB.getAnEnum());
        System.out.println(objectC.getHealth()+" "+objectC.getName()+" "+objectC.getAnEnum());



        objectA.methodName(23,34);
        objectB.methodName(34);
        objectC.methodName(67,0);
    }
}
