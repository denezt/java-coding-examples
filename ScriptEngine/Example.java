import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.Invocable;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.lang.NoSuchMethodException;

public class Example {

	private void runJsFile() throws ScriptException, FileNotFoundException {
		ScriptEngineManager m = new ScriptEngineManager();
		ScriptEngine e = m.getEngineByExtension("js");
		e.eval(new FileReader("./runme.js"));
	}

	public static void main(String[] args) throws ScriptException, NoSuchMethodException, FileNotFoundException {
		ScriptEngineManager m = new ScriptEngineManager();
		ScriptEngine e = m.getEngineByExtension("js");
		e.eval("function post(message){ print(message) }");
		Invocable i = (Invocable) e;
		i.invokeFunction("post","Greetings from Earth.");
		
		Example ex = new Example();
		ex.runJsFile();
	}

}
