package interval_ir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {

	@Test
	void test() {
		Interval interval = new Interval();
		interval.lowerLimit = 3;
		interval.upperLimit = 7;
		int length = interval.upperLimit - interval.lowerLimit;
		assertEquals(4, length);
	}

}
