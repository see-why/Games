package hello;

public class Menu {
	String[] options = { "View Database", "Add new item", "Delete item", "Quit program" };
	
	String getOptions() {
		
		String txtOptions = ("Choose an Option:\n");
		for(int i = 0; i < options.length; i++) {
			txtOptions += String.format(" %d. %s\n", i, options[i]);
		}
		
		return txtOptions;
	}
}
