package smilito.designpatterns.proxy;

public class CommandExecutorProxy implements CommandExecutor {
	
	private boolean hasPrivileges;
	private CommandExecutor executor;
	
	public CommandExecutorProxy(String privilege){
		if(privilege.equalsIgnoreCase("ADMIN")) {
			hasPrivileges=true;
		}
		this.executor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		
		if(hasPrivileges){
			executor.runCommand(cmd);
		} else {
			if(cmd.trim().startsWith("rm")){
				throw new Exception("not allowed commmand if you re not admin");
			} else {
				executor.runCommand(cmd);
			}
		}
		

	}

}
