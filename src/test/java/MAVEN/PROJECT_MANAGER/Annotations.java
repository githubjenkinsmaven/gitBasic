package MAVEN.PROJECT_MANAGER;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	 @BeforeMethod(groups={"regression"})
		public void m05test1_bm_g_regression() {
		    System.out.println("");
			System.out.println("BeforeMethod{m05test1_bm_g_regression}BeforeMethod");
			
		}
	 
	 @Test(priority=2)
		public void m06test1_p2() {
			System.out.println("Method{m06test1_p2}Method");

		}
	 
	 
	 
	 @AfterClass                   // NON STATIC
		public void m14test1_ac() {
			System.out.println("AfterClass{m14test1_ac}AfterClass");

		}
	 
	 
	 @Test(priority=1)
		public void m07test1_p1() {
			System.out.println("Method{m07test1_p1}Method");

		}
	 
	 @Test(priority=2)
		public void m08test1_p2() {
			System.out.println("Method{m08test1_p2}Method");

		}	
	
	
	 @Test(groups={"smoke","security"})
	 public static void m09test1_g_smoke_security() {
		 System.out.println("Method{m09test1_g_smoke_security}Method");
		 }
	
	
	
	 @Test(groups={"smoke"})
	 public void m10test1_g_smoke() {
			System.out.println("Method{m10test1_g_smoke}Method");
		    }
	 
	 @Test(groups={"regression"})
	 public void m11test1_g_regression() {
			System.out.println("Method{m11test1_g_regression}Method");
		    }
	
	
	
	 @Test(groups={"smoke"})
	 public void m12test1_g_smoke() {
		 	System.out.println("Method{m12test1_g_smoke}Method");
		 	}
	
	
	@BeforeGroups({"smoke","regression","security"}) 
	 public void m04test1_bg_smoke_regression_security() {
		 	System.out.println("BeforeGroups{m04test1_bg_smoke_regression_security}BeforeGroups");
		    }
	 
	
	
	@BeforeSuite(groups={"smoke","regression","security"})
	 public void m01test1_bs() {
		 	System.out.println("BeforeSuite{m01test1_bs}BeforeSuite");
		 	}
	
	
	@BeforeClass(groups={"smoke","regression","security"})
	 public void m03test1_bc() {
		 	System.out.println("BeforeClass{m03test1_bc}BeforeClass");
		 	}
	
	
	@AfterSuite
	 public void m16test1_as() {
		 	System.out.println("AfterSuite{m16test1_as}AfterSuite");
		 	}
	
	
	@AfterMethod
	 public void m13test1_am() {
		 	System.out.println("AfterMethod{m13test1_am}AfterMethod");
		 	 System.out.println("");
		 	}
	
	
	@AfterTest
	 public void m15test1_at() {
		 	System.out.println("AfterTest{m15test1_at}AfterTest");
		 	}
	
	@BeforeTest(groups={"smoke"})
	 public void m02test1_bt_g_smoke() {
		 	System.out.println("BeforeTest{m02test1_bt_g_smoke}BeforeTest");
		 	}

}
