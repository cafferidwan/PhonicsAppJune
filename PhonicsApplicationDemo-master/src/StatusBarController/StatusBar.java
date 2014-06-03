package StatusBarController;


public class StatusBar 
{

	public static void showStatusBar() 
	{
		try 
		{
			String command;
			command = "LD_LIBRARY_PATH=/vendor/lib:/system/lib am startservice -n com.android.systemui/.SystemUIService";
			Process proc = Runtime.getRuntime().exec( new String[] { "su", "-c", command });
			proc.waitFor();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	public static void hideStatusBar() 
	{
		try 
		{
			String command;
			command = "LD_LIBRARY_PATH=/vendor/lib:/system/lib service call activity 42 s16 com.android.systemui";
			Process proc = Runtime.getRuntime().exec(
					new String[] { "su", "-c", command });
			proc.waitFor();
		} 
		catch (Exception e) 
		{
			// something went wrong, deal with it here
		}
	}

}