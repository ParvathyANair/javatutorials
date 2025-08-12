
package main;

import demo.Demo; 

public class Main {
    public static void main(String[] args) {
        Demo myDemoObject = new Demo();
        System.out.println(myDemoObject.message);
        myDemoObject.displayMessage();
    }
}