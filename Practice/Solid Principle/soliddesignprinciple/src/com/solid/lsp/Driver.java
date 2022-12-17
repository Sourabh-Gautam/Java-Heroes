package com.solid.lsp;

import java.util.List;

public class Driver {
	public static void main(String[] args) {
		HealthyFood food = new Pizza();
		food.cook(List.of("Maida", "Chilli", "Garam Masala"));
	}
}
