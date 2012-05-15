/*
 * Copyright 2011-2012 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.hadoop.admin.cli.commands;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jarred Li
 *
 */
public class BaseCommandTest {

	private BaseCommand cmd;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		cmd = new BaseCommand();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		cmd = null;
	}

	/**
	 * Test method for {@link org.springframework.data.hadoop.admin.cli.commands.BaseCommand#setCommandURL(java.lang.String)}.
	 */
	@Test
	public void testSetCommandURL() {
		String value = "jobs";
		cmd.setCommandURL(value);
		boolean contains = cmd.getCommandURL().contains(value);
		Assert.assertTrue(contains);
	}

}
