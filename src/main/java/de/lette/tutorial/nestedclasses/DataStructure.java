package de.lette.tutorial.nestedclasses;

import java.util.Iterator;

public class DataStructure {
	
	private static final int SIZE = 30;
	private int[] arrayOfInts = new int[SIZE];
	
	public DataStructure() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
	}
	
	public void print(DataStructureIterator iterator)
	{
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
	}
	
	public void printEven() {
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
	}
	
	interface DataStructureIterator extends Iterator<Integer> { }
	
	class EvenIterator implements DataStructureIterator
	{

		private int nextIndex = 0;
		
		@Override
		public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
		}

		@Override
		public Integer next() {
			Integer value = Integer.valueOf(arrayOfInts[nextIndex]);
			nextIndex += 2;
			return value;
		}
	}
	
	public static void main(String[] args) {
		DataStructure ds = new DataStructure();
        ds.printEven();
        ds.print(ds.new EvenIterator());
        
	}
	
}
