package range;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class RangeTest {

	@Test
	public void includes_less_range内() {
		Range<Integer> r = Range.less(2);

		assertTrue(r.includes(1));
	}

	@Test
	public void includes_less_range外() {
		Range<Integer> r = Range.less(1);

		assertFalse(r.includes(2));
	}

	@Test
	public void includes_less_range境界() {
		Range<Integer> r = Range.less(1);

		assertFalse(r.includes(1));
	}

	@Test
	public void includes_equalOrLess_range内() {
		Range<Integer> r = Range.equalOrLess(1);

		assertTrue(r.includes(0));
	}

	@Test
	public void includes_equalOrLess_range外() {
		Range<Integer> r = Range.equalOrLess(1);

		assertFalse(r.includes(2));
	}

	@Test
	public void includes_equalOrLess_range境界() {
		Range<Integer> r = Range.equalOrLess(1);

		assertTrue(r.includes(1));
	}

	@Test
	public void includes_more_range内() {
		Range<Integer> r = Range.more(1);

		assertTrue(r.includes(2));
	}

	@Test
	public void includes_more_range外() {
		Range<Integer> r = Range.more(1);

		assertFalse(r.includes(0));
	}

	@Test
	public void includes_more_range境界() {
		Range<Integer> r = Range.more(1);

		assertFalse(r.includes(1));
	}

	@Test
	public void includes_equalsOrMore_range内() {
		Range<Integer> r = Range.equalOrMore(1);

		assertTrue(r.includes(2));
	}

	@Test
	public void includes_equalsOrMore_range外() {
		Range<Integer> r = Range.equalOrMore(1);

		assertFalse(r.includes(0));
	}

	@Test
	public void includes_equalOrMore_range境界() {
		Range<Integer> r = Range.equalOrMore(1);

		assertTrue(r.includes(1));
	}

	@Test
	public void Double_includes_less_range内() {
		Range<Double> r = Range.less(3.10);

		assertTrue(r.includes(3.00));
	}

}
