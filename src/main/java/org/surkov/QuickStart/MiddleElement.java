package org.surkov.QuickStart;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MiddleElement {

  private static void insertionsort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int key = array[i];
      int j = i - 1;
      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = key;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] digits = reader.readLine().split(" ");
    int[] numbers = new int[digits.length];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(digits[i]);
    }

    insertionsort(numbers);
    writer.write(String.valueOf(numbers[1]));

    reader.close();
    writer.close();
  }
}
