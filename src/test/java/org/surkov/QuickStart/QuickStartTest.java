package org.surkov.QuickStart;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.surkov.QuickStart.Triangle.getResult;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickStartTest {

  @Nested
  class Triangle {

    @Test
    public void tests() {
      assertEquals("YES", getResult(3, 4, 5));
      assertEquals("YES", getResult(3, 5, 4));
      assertEquals("YES", getResult(4, 5, 3));
    }
  }
}
