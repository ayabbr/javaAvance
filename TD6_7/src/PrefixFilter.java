import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrefixFilter implements DirectoryStream.Filter<Path>{
	
	      public  long taille ;
	      
	      public PrefixFilter(long taille) {
	    	  this.taille=taille;
	      }
	     
	@Override
	public boolean accept(Path element) throws IOException {
	
	return Files.size(element) >= taille;
}



}




