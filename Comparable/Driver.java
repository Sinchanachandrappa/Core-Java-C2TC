package com.tns.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Dell", 16,8000));
		laps.add(new Laptop("Apple", 12,18000));
		laps.add(new Laptop("Acer", 11,5000));
		Collections.sort(laps);
		for(Laptop L:laps)
		{
			System.out.println(L);
		}
	}
}