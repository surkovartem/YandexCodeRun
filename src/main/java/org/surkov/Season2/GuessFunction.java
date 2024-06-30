package org.surkov.Season2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Собрались как-то круги, формула, теорема и олимпиада и решили посчитать функцию. К сожалению, им
 * нужно было очень спешить на YoungCon,поэтому они успели посчитать только первые 10 значений. Они
 * очень хотят подарить по значению функции всем участникам конференции, поэтому просят вас помочь
 * посчитать их для различных n. Помогите ребятам порадовать всех на конференции!
 *
 * Примеры: f(1)=1, f(2)=1, f(3)=2, f(4)=2, f(5)=4, f(6)=2, f(7)=6, f(8)=4, f(9)=6, f(10)=4.
 */
public class GuessFunction {

  public static long phi(long n) {
    long result = n;
    for (long i = 2; i * i <= n; ++i) {
      if (n % i == 0) {
        while (n % i == 0) {
          n /= i;
        }
        result -= result / i;
      }
    }
    if (n > 1) {
      result -= result / n;
    }
    return result;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(reader.readLine());
    writer.write(String.valueOf(phi(n)));

    reader.close();
    writer.close();
  }
}
