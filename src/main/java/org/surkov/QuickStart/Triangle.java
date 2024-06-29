package org.surkov.QuickStart;

import java.io.*;

/**
 * Даны три натуральных числа. Возможно ли построить треугольник с такими сторонами? Если это
 * возможно, выведите строку YES, иначе выведите строку NO.
 */
public class Triangle {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());

    if (a + b > c && a + c > b && c + b > a) {
      writer.write("YES");
    } else {
      writer.write("NO");
    }

    reader.close();
    writer.close();
  }
}
