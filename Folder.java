import java.util.*;

public class Folder{
	private String folderName;
	private List<File> filesInFolder;
	private List <Folder> subfolders;
	
	public Folder(String name){
		this.folderName = name;
		this.filesInFolder = new ArrayList<>();
		this.subfolders = new ArrayList<>();
	}

	public String getFolderName(){
		return folderName;
	}

	public void setFolderName(String name){
		folderName = name;
	}

	public List<Folder> getSubfolders(){
		return subfolders;
	}

	public void addSubfolder(Folder subfolder){
		subfolders.add(subfolder);
	}

	public List<File> getFilesInFolder(){
		return filesInFolder;
	}

	public void addFile(File file){
		filesInFolder.add(file);
	}

	public void deleteFiles(){
		filesInFolder.clear();
	}

	public void deleteSubfolder(Folder subfolderToDelete){
		for(Folder subfolder : subfolders){
			subfolder.deleteFiles();
			subfolder.subfolders.clear();
		}
		subfolders.remove(subfolderToDelete);
	}

	public void printSubfolders(){
		for(Folder subfolder: subfolders){
			System.out.print(subfolder.getFolderName() + ", ");
		}
	}

	public void printFilesInFolder(){
		for(File file: filesInFolder){
			System.out.print(file.getFileName() + ", ");
		}
	}

	public void print(){
		System.out.println("Folder Name: " + this.getFolderName());
		System.out.print("Subfolders: ");
		this.printSubfolders();

		System.out.print("\nFiles in Folder: ");
		this.printFilesInFolder();
		System.out.println("\n");
	}
}