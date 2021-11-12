package methodDrivenFramework;



public class ValidLoginTest {
	public static void main(String[] args) throws Throwable {
		// open browser, enter URL and verify LoginPage
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		
		//Login into application and verify HOmepage
		LoginPage lp= new LoginPage();
		lp.login("admin", "manager");
		
		
		
		

	}

}
