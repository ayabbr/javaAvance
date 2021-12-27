import static org.junit.Assert.*;

import org.junit.Test;

import Bag2.BagOrder;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;




public class Bag2Test {

	
	@Test
	public void testCollec() {
		Bag2<String> b = new Bag2<String>(BagOrder.ANY);
		assertTrue((b instanceof Collection));
	}
	
	@Test
	public void testColl() {
		Bag2 bag = new Bag2<>(BagOrder.INSERT);
		bag.add("zz");
		bag.add("aa");
		bag.add("zz");
		bag.add("d");
		
		Iterator<String > it = bag.iterator();
		assertEquals("zz", it.next());
		assertEquals("zz", it.next());
		assertEquals("aa", it.next());
		assertEquals("d", it.next());
	}
	
	@Test
	public void testIter() {
		Bag2<String> bag = new Bag2<>(BagOrder.NATURAL);
		bag.add("zz");
		bag.add("aa");
		bag.add("zz");
		bag.add("d");
		String s = "";
		for (String e:bag) {
			s += e;
		}
		assertEquals(s, "aadzzzz");
		
	}
	
	@Test
	public void testColl2() {
		Bag2<String> bag = new Bag2<>(BagOrder.NATURAL);
		bag.add("zz");
		bag.add("aa");
		bag.add("zz");
		bag.add("d");
		
		Iterator<String > it = bag.iterator();
		assertEquals("aa", it.next());
		assertEquals("d", it.next());
		assertEquals("zz", it.next());
		assertEquals("zz", it.next());
	}
	
	@Test
	public void testAddRemove() {
		Bag2<Integer> bag = new Bag2<>(BagOrder.ANY);
		bag.add(42);
		bag.add(42);
		assertEquals(2, bag.count(42));
		bag.remove(42);
		assertEquals(1, bag.count(42));
		bag.remove(42);
		assertEquals(0, bag.count(42));
		assertEquals(false, bag.contains(42));
	}
	
	@Test
	public void testRemove() {
		Bag2<Integer> bag = new Bag2<>(BagOrder.ANY);
		assertEquals(false, bag.remove(42));
	}
	
	/*
	@Test(expected=NoSuchElementException.class)
	public void badUseOfIterator() {
		Collection<Integer> bag = new Bag<>();
		bag.add(2);
		Iterator<Integer> it = bag.iterator();
		it.next();
		it.next();
		assertThrows(expectedType, executable)
	}
	*/
	
	@Test
	public void badUseOfIterator() {
		Collection<Integer> bag = new Bag2<>();
		bag.add(2);
		Iterator<Integer> it = bag.iterator();
		it.next();
		
		assertThrows(NoSuchElementException.class, () -> it.next());
	}
}



