package kodlamaIO.core.logging;

public class Filelogger implements Logger{

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
			System.out.println("Dosyay LOGLANDI" + data);
	}

}
