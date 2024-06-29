package org.surkov.QuickStart;

import java.io.*;

/**
 * Даны три натуральных числа. Возможно ли построить треугольник с такими сторонами? Если это
 * возможно, выведите строку YES, иначе выведите строку NO.
 */
public class Triangle {

  public static String getResult(int a, int b, int c) {
    if (a + b > c && a + c > b && c + b > a) {
      return "YES";
    } else {
      return "NO";
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());

    writer.write(getResult(a, b, c));

    reader.close();
    writer.close();
  }
}
