package com.develogical.web;

import java.io.PrintWriter;

public class IndexPage extends HtmlPage {

  @Override
  protected void writeContentTo(PrintWriter writer) {
    writer.println(
        "<h2 span style='color:blue'>Welcome All!</h2>"
            + "<p>Please enter your query in the box below: "
            + "<form><input type=\"text\" name=\"q\" />"
            + "<input type=\"submit\" style=\" background-color: #04AA6D;border: none;color: white;padding: 16px 32px;text-decoration: none;margin: 4px 2px;cursor: pointer;\">"
            + "</form>"
            + "</p>");
  }
}
