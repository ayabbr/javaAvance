import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path=Paths.get(".");
		DirMonitor d= new DirMonitor(path);
		
		d.Affichage_DirectoryStream();
		System.out.println(d.sizeOfFiles());
		System.out.println(d.mostRecent());

	}

}
