package com;

public class Main {

  public static void main(String[] args) {
    System.out.println("Main.main.start");
    for (String arg : args) {
      System.out.println(arg);
    }
    System.out.println("Main.main.end");
  }
}
