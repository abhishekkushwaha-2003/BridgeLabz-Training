package com.inheritance.singleinhertance;

public class SmartHomeMain {
		public static void main(String[] args) {

			// creating Thermostat object
			Device d = new Thermostat("TH-101", true, 24);

			// polymorphic method call
			d.displayStatus();
		}
	}

