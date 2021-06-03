package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.validation.Validator;

public class ApplicationTest {
Validator v;
	@BeforeEach
void initialize()
{
		v=new Validator();
}
	@Test
	void testTitre()
	{
		assertTrue(v.testNotBlank("hello"));
		
	}
	@Test
	void testPrix()
	{
		assertTrue(v.validPrix(400));
	}
	@Test
	void testDescription()
	{
		assertTrue(v.validDescription("bonjour le monde"));
	}
}
