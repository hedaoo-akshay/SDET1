package keywordDrivenFramework;

public class KeywordMainclass {

	public static void main(String[] args) throws Throwable {
		FileLib flib=new FileLib();
		String br = flib.readPropertyData("./data/config.properties", "username");
		System.out.println(br);

	}

}
