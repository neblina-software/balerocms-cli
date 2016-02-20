package com.balerocms

import com.balerocms.classes.UpdateManager
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BalerocmsCliApplication {

	static void main(String[] args) {
		SpringApplication.run BalerocmsCliApplication, args
		UpdateManager updateManager = new UpdateManager();
		updateManager.init();
	}
}
