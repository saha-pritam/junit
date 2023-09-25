package org.pritam.testing.hamcrest;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class HamcrestDemo {

	@Test
	public void test1() {
		int x=1;
		assertThat(x,is(1));
	}
	
	@Test
	public void test2() {
		int x=1;
		assertThat(x,is(2));
	}
	
	@Test
	public void test3() {
		int x=1;
		assertThat(x,equalTo(1));
	}
	
	@Test
	public void test4() {
		int x=1;
		assertThat(x,equalTo(4));
	}
	
	@Test
	public void test5() {
		String x="Pritam";
		assertThat(x, allOf(is("Pritam"), startsWith("Pr")));
	}
	
	@Test
	public void test6() {
		String x="Pritam";
		assertThat(x, allOf(is("Pritam"), startsWith("Pre")));
	}
	
	@Test
	public void test7() {
		String x="Pritam";
		assertThat(x, anyOf(is("Pritam"), startsWith("Pre")));
	}
	
	@Test
	public void test8() {
		String x="Pritam";
		assertThat(x, anyOf(is("Prita"), startsWith("Pre")));
	}
	
	@Test
	public void test9() {
		String x=null;
		assertThat(x, notNullValue());
	}
	
	@Test
	public void test10() {
		String x="Pritam";
		assertThat(x, notNullValue());
	}
	
	@Test
	public void test11() {
		String x=null;
		assertThat(x, nullValue());
	}
	
	@Test
	public void test12() {
		String x="Pritam";
		assertThat(x, nullValue());
	}
}
