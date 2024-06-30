package org.surkov.QuickStart;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class WordCounter {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    Set<String> words = new HashSet<>();
    String line;
    while ((line = reader.readLine()) != null) {
      String[] wordsArray = line.split("\\s+");
      for (String word : wordsArray) {
        if (!word.isEmpty()) {
          words.add(word);
        }
      }
    }
    writer.write(String.valueOf(words.size()));

    reader.close();
    writer.close();
  }
}
