package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_deux () {

		// Then
		Assert.assertEquals("onze", Convert.num2text("11"));
	}
	@Test
	public void test_text2num_zero () {

		// Then
		Assert.assertEquals("0", Convert.text2num("zéro"));
	}
	

}
