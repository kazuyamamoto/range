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
	public void includes_equalOrMore_range内() {
		Range<Integer> r = Range.equalOrMore(1);

		assertTrue(r.includes(2));
	}

	@Test
	public void includes_equalOrMore_range外() {
		Range<Integer> r = Range.equalOrMore(1);

		assertFalse(r.includes(0));
	}

	@Test
	public void includes_equalOrMore_range境界() {
		Range<Integer> r = Range.equalOrMore(1);

		assertTrue(r.includes(1));
	}

	@Test
	public void includes_equalOrMoreAndEqualOrLess_range内() {
		Range<Integer> r = Range.equalsOrMoreAndEqualsOrLess(1, 3);

		assertTrue(r.includes(2));
	}

	@Test
	public void includes_equalOrMoreAndEqualOrLess_下限外() {
		Range<Integer> r = Range.equalsOrMoreAndEqualsOrLess(1, 3);

		assertFalse(r.includes(0));
	}

	@Test
	public void includes_equalOrMoreAndEqualOrLess_上限外() {
		Range<Integer> r = Range.equalsOrMoreAndEqualsOrLess(1, 3);

		assertFalse(r.includes(4));
	}

	@Test
	public void includes_equalOrMoreAndEqualOrLess_下限境界() {
		Range<Integer> r = Range.equalsOrMoreAndEqualsOrLess(1, 3);

		assertTrue(r.includes(1));
	}

	@Test
	public void includes_equalOrMoreAndEqualOrLess_上限() {
		Range<Integer> r = Range.equalsOrMoreAndEqualsOrLess(1, 3);

		assertTrue(r.includes(3));
	}

	@Test
	public void Double_includes_less_range内() {
		Range<Double> r = Range.less(3.1);

		assertTrue(r.includes(3.0));
	}

}
