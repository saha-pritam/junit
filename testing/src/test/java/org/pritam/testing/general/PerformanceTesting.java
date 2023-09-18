package org.pritam.testing.general;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformanceTesting {

	@Test(timeout = 1)
	public void test1() {
		for(int i=1;i<10;i++)
			for(int j=1;j<10;j++)
			{
				System.out.println("Test1");
			}
	}
	
	@Test(timeout = 1)
	public void test2() {
		for(int i=1;i<100;i++)
			for(int j=1;j<100;j++)
			{
				System.out.println("Test2");
			}
	}

}
