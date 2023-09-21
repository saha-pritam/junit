package org.pritam.testing.general;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.pritam.testing.helper.StringHelper;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	
	private StringHelper stringHelper = new StringHelper();
	private String expectedOutput;
	private String input;
	
	public ParameterizedTest(String expectedOutput, String input) {
		super();
		this.expectedOutput = expectedOutput;
		this.input = input;
	}

	@Parameters
	public static Collection<String[]> parameters(){
		String expectedOutputAndInput[][]= {
				{"","A"},
				{"","AA"},
				{"B","AB"},
				{"CD","AACD"},
				{"CD","CD"},
				{"","CD"}
				};
		return Arrays.asList(expectedOutputAndInput);
	}
	
	@Test
	public void test() {
		assertEquals(expectedOutput,stringHelper.truncateAInFirst2Positions(input));
	}

}
