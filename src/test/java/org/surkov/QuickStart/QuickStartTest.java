package org.surkov.QuickStart;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickStartTest {

  @Nested
  class Triangle {

    @Test
    public void tests() {
      assertEquals("YES", org.surkov.QuickStart.Triangle.getResult(3, 4, 5));
      assertEquals("YES", org.surkov.QuickStart.Triangle.getResult(3, 5, 4));
      assertEquals("YES", org.surkov.QuickStart.Triangle.getResult(4, 5, 3));
    }
  }

  @Nested
  class ListGrowing {

    @Test
    public void tests() {
      assertEquals("YES", org.surkov.QuickStart.ListGrowing.getResult(new int[] {1, 7, 9}));
      assertEquals("NO", org.surkov.QuickStart.ListGrowing.getResult(new int[] {1, 9, 7}));
      assertEquals("NO", org.surkov.QuickStart.ListGrowing.getResult(new int[] {2, 2, 2}));
    }
  }
}
