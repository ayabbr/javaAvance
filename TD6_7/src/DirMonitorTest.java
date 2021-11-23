import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

class DirMonitorTest {

	@Test
	public void Affichage_DirectoryStream() throws IOException {
		
		  DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get("."));
		assertSame(Paths.get("."), stream);
	}

}
