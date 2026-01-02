package com.encapsulationpolymorphisminterfaceandabstractclass;

//interface for reservation related work
interface Reservable {

	// reserve item
	void reserveItem(String borrowerName);

	// check availability
	boolean checkAvailability();
}

