package smilito.designpatterns.proxy;

public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws Exception {
		Process p = Runtime.getRuntime().exec(cmd);
		System.out.println("Command executed: " + cmd);
	}

}
