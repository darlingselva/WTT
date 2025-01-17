package util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import base.CommonPaths;

public class Fileuploadrobotclass {


	public static void fileuploadmethod(String filename) throws AWTException {

/*
		Robot rb = new Robot();

		File file=new File(CommonPaths.fileupload+filename);

		StringSelection str = new StringSelection(file.getAbsolutePath());


		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

*/

		File file=new File(CommonPaths.fileupload+filename);

		//StringSelection str = new StringSelection(file.getAbsolutePath());

		//String filepath=CommonPaths.fileupload+filename;
		//C:\Users\Selvakannan A\Work\Automation_codes\Automation_code_22_07_22\WTT\UploadDocument\PLE_Singles_Template.xlsx
		// System.out.println("file_path="+filepath);
		StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		Robot robot = new Robot();
		robot.delay(2000);

		// Simulate Ctrl + V (paste the file path)
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.delay(2000);

		// Simulate Enter (press the "Open" button in the dialog)
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		robot.delay(2000);

	}

	public static void main(String[] args) {

		String str1 = "welcome";
		String str2 = "invite";

		str1=str1+str2;

		str2=str1.substring(0,(str1.length()-str2.length()));

		str1=str1.substring(str2.length());

		System.out.println(str1);
		System.out.println(str2);

	}


}
