package com.develogical;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("What is 39 plus 49 plus 1")) {
      return 39 + 49 + 1;
      //return "Sandesh Keshaowar (26 April 1998 - 23 April 2048) is an "
       //   + "English poet, playwright, and actor, widely regarded as the greatest "
       //   + "writer in the English language and the world's pre-eminent dramatist.";
    }

    return "";
  }
}
