package com.tnsif.inheritance;

class India {
	protected String lang = "Hindi";

	void displayNational() {
		System.out.println("language" + lang);
	}
}

public class Karnataka extends India {

	public String lang = "kannada";

	void displayLocal() {
		System.out.println("language" + lang);
	}

	public class kerala extends Karnataka {
		public String lang = "malyalam";

		void displayLocall() {
			System.out.println("language" + lang);
		}
	}
}
