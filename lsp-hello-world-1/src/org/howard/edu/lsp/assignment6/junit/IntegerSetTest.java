package org.howard.edu.lsp.assignment6.junit;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class IntegerSetTest {
	
	IntegerSet integerSet;
	

	@Test
	@DisplayName("IntegerSet.clear test case")
	public void testClear() {
	
		
		ArrayList<Integer> list= new ArrayList<>();
		IntegerSet set1= new IntegerSet(list);

		
		list.add(2);
		list.add(9);
		list.add(11);
		
		assertEquals(false,list.isEmpty());
		
		list.clear();
		
		assertTrue(list.isEmpty());
		
		
	}
	
	@Test
	@DisplayName("IntegerSet.length test case")
	
	public void testLength() {
	
		
		ArrayList<Integer> list= new ArrayList<>();
		IntegerSet set1= new IntegerSet(list);

		
		set1.add(2);
		set1.add(9);
		set1.add(11);
		
		
		assertEquals(3, set1.length());
		
		set1.add(65);
		set1.add(3);
		set1.add(13);
		
		assertEquals(6, set1.length());
		
		
	}
	
	
	@Test
	@DisplayName("IntegerSet.equals test case")
	public void testEquals() {
	
		
		ArrayList<Integer> list= new ArrayList<>();
		IntegerSet set1= new IntegerSet(list);
		
		ArrayList<Integer> list2= new ArrayList<>();
		IntegerSet set2= new IntegerSet(list2);
		
		set1.add(2);
		set1.add(9);
		set1.add(11);
		
		set2.add(2);
		set2.add(9);
		set2.add(11);
		
		assertTrue(set1.equals(set2));
		
		set1.add(8);
		set1.add(1);
		set1.add(12);
		
		set2.add(8);
		set2.add(1);
		set2.add(19);
		
		assertEquals(false , set1.equals(set2));
		
		
		
		
	}
	
	
	@Test
	@DisplayName("IntegerSet.contains test case")
	public void testContains() {
		
		ArrayList<Integer> list= new ArrayList<>();
		IntegerSet set1= new IntegerSet(list);
		
		set1.add(8);
		set1.add(1);
		set1.add(12);
		
		assertEquals(false,set1.contains(0));
		assertTrue(set1.contains(12));
		
		
	}
	
	
	
	
	@Test
	@DisplayName("IntegerSet.largestelement test case")
	public void testLargestelement() {
		
		
		ArrayList<Integer> list= new ArrayList<>();
		IntegerSet set1= new IntegerSet(list);
		
		set1.add(0);
		set1.add(12);
		set1.add(199);
		set1.add(2);
		
		try {
			assertEquals(199,set1.largestelement());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
		
		
	
		
		
		@Test
		@DisplayName("IntegerSet.largestelement throws exception")
		public void testLargestelementt_THROWS_EXCEPTION() {
			
			ArrayList<Integer> list= new ArrayList<>();
			IntegerSet set1= new IntegerSet(list);

			Exception exception = assertThrows(IntegerSetException.class, () -> {
				set1.largestelement();
				
			
			}
			
					);
			

			
			
			
		}
		
		
		@Test
		@DisplayName("IntegerSet.smallestelement throws exception")
		public void testSmallestelement_THROWS_EXCEPTION() {
			
			ArrayList<Integer> list= new ArrayList<>();
			IntegerSet set1= new IntegerSet(list);

			Exception exception = assertThrows(IntegerSetException.class, () -> {
				set1.smallestelement();
				
			
			}
			
					);
			

			
			
			
		}
		
		@Test
		@DisplayName("IntegerSet.smallestelement test case")
		public void testSargestelement() {
			
			
			ArrayList<Integer> list= new ArrayList<>();
			IntegerSet set1= new IntegerSet(list);
			
			set1.add(0);
			set1.add(12);
			set1.add(199);
			set1.add(2);
			
			try {
				assertEquals(0,set1.smallestelement());
			} catch (IntegerSetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
		}
	
	
	
		@Test
		@DisplayName("IntegerSet.add test case")
		public void testAdd() {
			ArrayList<Integer> list= new ArrayList<>();
			IntegerSet set1= new IntegerSet(list);
			
			assertTrue(list.isEmpty());
			set1.add(1);
			assertTrue(list.contains(1));
			set1.add(4);
			assertTrue(list.contains(4));
			
			
			
			
		}

	
	
		@Test
		@DisplayName("IntegerSet.remove test case")
		public void testRemove() {
			ArrayList<Integer> list= new ArrayList<>();
			IntegerSet set1= new IntegerSet(list);
			
			assertTrue(list.isEmpty());
			set1.add(1);
			set1.add(4);
			assertTrue(list.contains(4));
			set1.removeItem(4);
			assertEquals(false, list.contains(4));
			set1.removeItem(1);
			assertTrue(list.isEmpty());
			
			
			
			
		}

	
		@Test
		@DisplayName("IntegerSet.isEmpty test case")
		public void testisEmpty() {
			ArrayList<Integer> list= new ArrayList<>();
			IntegerSet set1= new IntegerSet(list);
			
			assertTrue(set1.isEmpty());
			
			set1.add(9);
			
			assertEquals(false, list.isEmpty());
			
		}
	
	
	
		
		@Test
		@DisplayName("IntegerSet.getlist test case")
		public void testGetlist() {
			ArrayList<Integer> list= new ArrayList<>();
			IntegerSet set1= new IntegerSet(list);
			
			set1.add(1);
			set1.add(4);
			
			 ArrayList<Integer> actual = new ArrayList<Integer>() {
		            {
		                add(1);
		                add(4);
		            }};
			
			assertEquals(set1.getlist(), actual);}
			
			
			
			
	
		
			@Test
			@DisplayName("IntegerSet.union test case")
			public void testUnion() {
				
				ArrayList<Integer> list= new ArrayList<>();
				IntegerSet set1= new IntegerSet(list);
				
				ArrayList<Integer> list2= new ArrayList<>();
				IntegerSet set2= new IntegerSet(list);
				
				set1.add(3);
				set1.add(4);
				
		
				set2.add(1);
				
				
				try {
					set1.union(set2);
				} catch (RuntimeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				
				assertTrue(set1.toString().equals("[3, 4, 1]"));
			}


			@Test
			@DisplayName("IntegerSet.intersection test case")
			public void testIntersection() {
				ArrayList<Integer> list= new ArrayList<>();
				IntegerSet set1= new IntegerSet(list);
				
				ArrayList<Integer> list2= new ArrayList<>();
				IntegerSet set2= new IntegerSet(list);
				
				
				set1.add(0);
				set1.add(2);
				
				set2.add(2);
				set2.add(1);
		
			
			System.out.println(set1.intersection(set2));
			IntegerSet fin = set1.intersection(set2);
			
					
			assertTrue(fin.toString().equals("[0, 2, 1]"));

			
		}
			
			@Test
			@DisplayName("IntegerSet.Unionthrows exception")
			public void testUnion_THROWS_EXCEPTION() {
				
				ArrayList<Integer> list= new ArrayList<>();
				IntegerSet set1= new IntegerSet(list);

				ArrayList<Integer> list2= new ArrayList<>();
				IntegerSet set2= new IntegerSet(list2);
				
				Exception exception = assertThrows(RuntimeException.class, () -> {
					set1.union(set2);
					
				}
			
						);
				
				
		
									
	
}
			
			@Test
			@DisplayName("IntegerSet.intersection throws exception")
			public void testintersection_THROWS_EXCEPTION() {
				
				ArrayList<Integer> list= new ArrayList<>();
				IntegerSet set1= new IntegerSet(list);

				ArrayList<Integer> list2= new ArrayList<>();
				IntegerSet set2= new IntegerSet(list2);
				
				Exception exception = assertThrows(RuntimeException.class, () -> {
					set1.intersection(set2);
				});
				
			}
}
