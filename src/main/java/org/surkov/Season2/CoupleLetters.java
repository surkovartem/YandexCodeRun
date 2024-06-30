package org.surkov.Season2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Имеется текст, состоящий из заглавных латинских символов и пробелов, длиной не более 255
 * символов. Словом в тексте называется последовательность букв, ограниченная пробелами, началом или
 * концом строки. Пара соседних слов разделена хотя бы одним пробелом.
 *
 * <p>Найдите такую пару символов, которая чаще всего встречается в тексте в качестве подстроки.
 * Например, «LL» является подстрокой в тексте «HELLO», а «HO» — нет.
 *
 * <p>Гарантируется, что в тексте есть хотя бы одно слово из 2 и более букв.
 */
public class CoupleLetters {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    Map<String, Integer> pairs = new HashMap<>();
    String[] words = reader.readLine().split(" ");

    for (String word : words) {
      String word1 = word.trim();
      for (int j = 0; j < word1.length() - 1; j++) {
        String pair = word1.substring(j, j + 2);
        if (pairs.containsKey(pair)) {
          pairs.put(pair, pairs.get(pair) + 1);
        } else {
          pairs.put(pair, 1);
        }
      }
    }

    int maxCount = 0;
    String mostFrequentPair = "";
    for (Map.Entry<String, Integer> entry : pairs.entrySet()) {
      if (entry.getValue() > maxCount) {
        maxCount = entry.getValue();
        mostFrequentPair = entry.getKey();
      } else if (entry.getValue() == maxCount && entry.getKey().compareTo(mostFrequentPair) > 0) {
        maxCount = entry.getValue();
        mostFrequentPair = entry.getKey();
      }
    }

    writer.write(mostFrequentPair);
    writer.close();
    reader.close();
  }
}
