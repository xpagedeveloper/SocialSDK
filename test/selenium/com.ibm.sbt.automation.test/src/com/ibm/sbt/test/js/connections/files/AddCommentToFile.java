/*
 * � Copyright IBM Corp. 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package com.ibm.sbt.test.js.connections.files;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ibm.sbt.automation.core.test.connections.BaseFilesTest;

/**
 * 
 * @author Vineet Kanwal
 *
 */
public class AddCommentToFile extends BaseFilesTest {
	
	@Before
	public void init() {
		createFile();
		addSnippetParam("sample.fileId", fileEntry.getFileId());
	}

	@After
	public void destroy() {
		deleteFileAndQuit();
	}

    @Test
    public void testNoError() {
        boolean result = checkNoError("Social_Files_Add_Comment_To_File");
        assertTrue(getNoErrorMsg(), result);
    }

}
