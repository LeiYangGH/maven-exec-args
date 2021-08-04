package com;

import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;

public class Main {

  public static void main(String[] args) {
    System.out.println("Main.main.start");
    ArgumentParser parser = ArgumentParsers.newFor("exec-experiments").build()
        .defaultHelp(true)
        .description("arg parse.");
    parser.addArgument("-n", "--name")
        .setDefault("unknown")
        .help("Your name");
    parser.addArgument("-g", "--gender")
        .choices("F", "M").setDefault("M")
        .help("Your gender (F,M)");
    for (String arg : args) {
      System.out.println(arg);
    }
    Namespace ns = null;
    try {
      ns = parser.parseArgs(args);
    } catch (ArgumentParserException e) {
      parser.handleError(e);
      System.exit(1);
    }
    System.out.println(String.format("name=%s,gender=%s", ns.getString("name"),
        ns.getString("gender")));
    System.out.println("Main.main.end");
  }
}
