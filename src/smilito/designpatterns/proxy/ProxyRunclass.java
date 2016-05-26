package smilito.designpatterns.proxy;

public class ProxyRunclass {

	public static void run(){
		System.out.println("BEGIN PROXY PATTERN ================");
		CommandExecutor ce = new CommandExecutorProxy("NOT_ADMIN");
		try{
			ce.runCommand("ls -ltr");
			ce.runCommand("rm pepe.txt");
		}catch(Exception ex){
			System.out.println("EXCEPTION OCURRED: " + ex);
		}
		System.out.println("END   PROXY PATTERN ================");
	}
}
