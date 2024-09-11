package com.example.springfirst.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Component
public class Laptop implements Computer {
	
		@Autowired
		Cpu cpu;

		public void compile() {
			System.out.println("Compiling in laptop");
//			cpu.process();
		}
}
