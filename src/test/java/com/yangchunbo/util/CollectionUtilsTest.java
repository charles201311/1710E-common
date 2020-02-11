package com.yangchunbo.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

public class CollectionUtilsTest {

	@Test
	public void testIsEmpty() {
		
		/*
		 * ArrayList<String> list = new ArrayList<String>(); list.add("a"); boolean b =
		 * CollectionUtils.isEmpty(list);
		 */
		LinkedList list2 = new LinkedList();
		ArrayList<String> list = new ArrayList<String>();
		boolean b2 = CollectionUtils.isEmpty(list);
		System.out.println(b2);
		
	}

}
