import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import Bag.BagOrder;


public class Bag1Test {

	@Test
	public void testCount1() {
		Bag<String> bag = new Bag<>();
		bag.add("toto");
		assertEquals(1, bag.count("toto"));
	}
	
	@Test
	public void testCount2() {
		Bag<String> bag = new Bag<>();
		bag.add("toto");
		bag.add("toto");
		bag.remove("toto");
		assertEquals(1, bag.count("toto"));
	}
	
	@Test
	public void testCount3() {
		Bag<String> bag = new Bag<>();
		bag.add("toto");
		bag.add("toto");
		assertEquals(2, bag.count("toto"));
	}
	
	@Test
	public void testOrder3() {
		
		Bag<String> bag=new Bag<>(BagOrder.ANY);
		bag.add("toto");
		bag.add("toto");
		bag.add("titi");

		Iterator<Map.Entry<String, Integer>> it = bag.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> e = it.next();
			System.out.println(e.getKey()+'='+e.getValue());
	}
	}
	
	@Test
	public void testCount4() {
		Bag<Integer> bag = new Bag<>();
		bag.add(2);
		bag.add(2);
		bag.remove(2);
		bag.remove(2);
		
		assertEquals(0, bag.count(2));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testOrder() {
		try{
			Bag<String> bag = new Bag<>(BagOrder.NATURAL);
			bag.add("zz");
			bag.add("aa");
			bag.add("zz");
			bag.add("d");
		
			Iterator<Map.Entry<String, Integer>> it = bag.iterator();
			//it's a fail comparison 
			assertEquals("aa", it.next().getKey());//it.next().getKey() return "zz" so the comparison is a fail cause they are notEqual
			assertEquals("d", it.next().getKey());//same
			Entry<String, Integer> entry = it.next();
			assertEquals("zz", entry.getKey());
			assertEquals(new Integer(2), entry.getValue());
		}catch(Exception e) {
			System.out.println("errorrrrrrrrrr");
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testOrder2() {
		Bag<String> bag = new Bag<>(BagOrder.INSERT);
		bag.add("zz");
		bag.add("aa");
		bag.add("zz");
		bag.add("d");
		
		Iterator<Map.Entry<String, Integer>> it = bag.iterator();
		Entry<String, Integer> entry = it.next();
		assertEquals("zz", entry.getKey());
		assertEquals(new Integer(2), entry.getValue());
		assertEquals("aa", it.next().getKey());
		assertEquals("d", it.next().getKey());
	}
}

