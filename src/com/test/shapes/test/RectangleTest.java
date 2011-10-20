package com.test.shapes.test;

import org.junit.Test;

import com.test.shapes.Rectangle;
import com.test.shapes.Shape;

public class RectangleTest {

	@Test(expected = IllegalArgumentException.class)
	public void testRectangleDimensionsWithInvalidValue() {
		Shape rectangle = new Rectangle(-10.0, 10.0);
	}
}
