package org.pritam.testing.general;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTesting {

	@Test
	public void test1() {
		int arr1[] = {5,4,3,2,1};
		int arr2[] = {1,2,3,4,5};
		Arrays.sort(arr1);
		assertEquals(arr2, arr1); //This would fail since assert equals will try to compare references rather than values
	}
	
	@Test
	public void test2() {
		int arr1[] = {5,4,3,2,1};
		int arr2[] = {1,2,3,4,5};
		Arrays.sort(arr1);
		assertArrayEquals(arr2, arr1); //To compare for array values we should use assert Array Equals method.
	}
	
	@Test
	public void test3() {
		int arr1[] = {5,4,3,2,1};
		int arr2[] = {1,20,3,4,5};
		Arrays.sort(arr1);
		assertArrayEquals(arr2, arr1); //This would fail since arr1[1] after sorting will be 2 and arr2[1] is 20
	}

}
