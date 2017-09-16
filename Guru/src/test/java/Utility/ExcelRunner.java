package Utility;
public class ExcelRunner {

	public static void main(String[] args)
	{
		System.out.println(ExcelManager.FILE_PATH);
		//String p = System.getProperty(("user.dir) + //src//test//java//ExcelWorkbook//TopSecrete.xlsx"));
		//System.out.println(p);
		System.out.println(ExcelManager.read_sheet(ExcelManager.FILE_PATH, 0, 0, 0));
	}
	
}
