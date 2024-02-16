public class File {
	private String fileName;

	public File(String name){
		this.fileName = name;
	}

	public String getFileName(){
		return fileName;
	}

	public void setFileName(String name){
		fileName = name;
	}

	public void print(){
		System.out.print(this.getFileName());
	}
}
