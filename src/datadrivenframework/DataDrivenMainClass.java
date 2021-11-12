package datadrivenframework;

public class DataDrivenMainClass {

	public static void main(String[] args) throws Throwable {
	FileLib flib = new FileLib();
	int rc=flib.getRowCount("./Data/InputData.xlsx", "Sheet1");
	System.out.println(rc);
	for(int i=0;i<=rc;i++)
	{
		String value=flib.readExcelData("./Data/InputData.xlsx", "Sheet1", i, 1);
		System.out.println(value);
		
		flib.writeExcelData("./Data/InputData.xlsx", "Sheet1", i, 2, "Raghav Sir");
	}

	}

}
