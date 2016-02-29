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
	void write() {
		System.out.println("Writing File...");
		String path = System.getProperty("user.dir") + "/updates/test/application.properties";
		ConfigEditor configEditor = new ConfigEditor();
		configEditor.writeFile(path, "Done!");
	}

}
