package com.balerocms

import com.balerocms.classses.ConfigEditor
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner)
@SpringApplicationConfiguration(classes = BalerocmsCliApplication)
class ConfigEditorTests {


	@Test
	void changeValue() {
		String random = Math.random();
		ConfigEditor configEditor = new ConfigEditor();
		configEditor.setProperty("example.value", random);
		System.out.println("production.value=" + configEditor.getProperty("production.value"));
	}

}
