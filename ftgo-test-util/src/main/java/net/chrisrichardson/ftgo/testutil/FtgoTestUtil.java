package net.chrisrichardson.ftgo.testutil;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

public class FtgoTestUtil {

  public static <T> void assertPresent(Optional<T> value) {
    assertTrue(value.isPresent());
  }
}
