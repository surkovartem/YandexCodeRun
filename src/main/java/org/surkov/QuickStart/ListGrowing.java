package org.surkov.QuickStart;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Дан список. Определите, является ли он монотонно возрастающим (то есть верно ли, что каждый
 * элемент этого списка больше предыдущего). Выведите YES, если массив монотонно возрастает и NO в
 * противном случае.
 */
public class ListGrowing {

  public static String getResult(int[] arr) {
    int prev = arr[0];
    for (int i = 1; i < arr.length; i++) {
      int cur = arr[i];
      if (prev >= cur) {
        return "NO";
      }
      prev = cur;
    }
    return "YES";
  }

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    String line = reader.readLine();
    String[] numbers = line.split(" ");
    int[] nums = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      nums[i] = Integer.parseInt(numbers[i]);
    }

    writer.write(getResult(nums));

    reader.close();
    writer.close();
  }
}
