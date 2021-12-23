package stepDefs;

import io.cucumber.java.en.When;

public class ModuleTwoStepDef {
	
		@When("User enters Task details")
		public void user_enters_task_details() {
			System.out.println("User enters Task details");
		}


		@When("User view Task details")
		public void user_view_task_details() {
			System.out.println("User view Task details");
		}

		@When("User update Task details")
		public void user_update_task_details() {
		    System.out.println("User update Task details");
		}



}
