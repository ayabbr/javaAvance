import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.io.File;

import static java.nio.file.AccessMode.*;

public class DirMonitor {
	
 private   Path path;
 
	public DirMonitor(Path path) {
		this.path=path;
		try {
            path.getFileSystem().provider().checkAccess(path, READ, EXECUTE);
            System.out.println("Le fichier peut être lu et exécuté");
        } catch (IOException e) {
            System.out.println("Le fichier ne peut pas être utilisé");
        }
	}
	
	public  void Affichage_DirectoryStream() throws IOException {
	   
	    DirectoryStream<Path> stream = Files.newDirectoryStream(this.path);
	    try { 
	      Iterator<Path> iterator = stream.iterator();
	      while(iterator.hasNext()) {
	        Path p = iterator.next();
	     
	        System.out.println(p); 
	      }
	    } finally { 
	      stream.close();
	    } 
	  }
	
	public long sizeOfFiles() throws IOException{
		long size=0;
		 DirectoryStream<Path> stream = Files.newDirectoryStream(this.path);
		for(Path p : stream) {
			size+=Files.size(p);
					
		}
			
		return size;
	}
	
	public File mostRecent() throws IOException {
		
		File file =new File(path.toString());
		File[] files=file.listFiles();
		
		File lastModifiedFile=files[0];
		
	    for (int i = 1; i < files.length; i++) {
	    	
	        if (lastModifiedFile.lastModified() < files[i].lastModified()) {
	            lastModifiedFile = files[i];
	        }
	     }
	     return lastModifiedFile;
					
		}
		
	
	public void applyAction(String prefix, MyAction action) throws IOException{
		
	}
}
