package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ModuleOneStepDef {
//		@BeforeStep
//		public void setupDB() {
//			System.out.println("Setup DB");
//		}
//		
//		@AfterStep
//		public void teardown() {
//			System.out.println("After Hook implementation");
//		}
	
//		@Before("@RegressionTest,@RegressionTestOne")
//		public void setupDB() {
//			System.out.println("Setup DB for regressionTest and RegressionTestOne");
//		}
//	
		//want to connect to dbone for regression test and dbTwo for smoketest.
//		@Before("@RegressionTest")
//		public void setupDBOne() {
//			System.out.println("Setup DB One for regressionTest");
//		}
//		
//		@Before("@SmokeTest")
//		public void setupDBTwo() {
//			System.out.println("Setup DB Two for SmokeTest");
//		}
	
		//Ordering Hooks
	
//		@Before(order=3)
//		public void setupDB() {
//			System.out.println("Setup DB");
//		}
//		
//		@Before(order=2)
//		public void initBrowser() {
//			System.out.println("Init Browser");
//		}
//		
//		@Before(order=1)
//		public void readPropertyFile() {
//			System.out.println("Read From Property File");
//		}
	
		//Combination of tags and hooks -> 2 requirement for regressionTest and execute in some specific order and same for smoketest
		@Before(order=1, value= "@RegressionTest")
		public void setupDBForReg() {
			System.out.println("Setup DB for regressionTest");
		}
		
		@Before(order=2, value= "@RegressionTest")
		public void initChromeBrowser() {
			System.out.println("Init chrome Browser");
		}
		
		@Before(order=1, value="@SmokeTest")
		public void setupDBForSmoke() {
			System.out.println("Setup DB for smokeTest");
		}
		
		@Before(order=2, value="@SmokeTest")
		public void initEdgeBrowser() {
			System.out.println("Init Edge Browser");
		}
		

		
//		@Before
//		public void setupDB() {
//			System.out.println("Setup DB");
//		}
//		
//		@After
//		public void teardown() {
//			System.out.println("After Hook implementation");
//		}

		@Given("User is loggedIn")
		public void user_is_logged_in() {
			System.out.println("User is loggedIn");

		}

		@When("User enters contact details")
		public void user_enters_contact_details() {
			
			System.out.println("User enters contact details");
		}
		

			@When("User view contact details")
			public void user_view_contact_details() {
				System.out.println("User view contact details");
			}

		

				@When("User update contact details")
				public void user_update_contact_details() {
					System.out.println("User update contact details");
				}


					@When("User enters Deal details")
					public void user_enters_deal_details() {
						System.out.println("User enters Deal details");
					}


						@When("User view Deal details")
						public void user_view_deal_details() {
							System.out.println("User view Deal details");
						}


							@When("User update Deal details")
							public void user_update_deal_details() {
								
								System.out.println("User Update Deal details");
							}

							
							@Given("User logged out")
							public void user_logged_out() {
								System.out.println("User logged out");
							}











}
