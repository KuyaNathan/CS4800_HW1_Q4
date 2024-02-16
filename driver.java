public class driver {
	public static void main(String[] args){
		Folder demo1 = new Folder("php_demo1");
		Folder sourceFiles = new Folder("Source Files");
		Folder phalcon = new Folder(".phalcon");
		Folder app = new Folder("app");
		Folder config = new Folder("config");
		Folder controllers = new Folder("controllers");
		Folder library = new Folder("library");
		Folder migrations = new Folder("migrations");
		Folder models = new Folder("models");
		Folder views = new Folder("views");
		Folder cache = new Folder("cache");
		Folder publicFolder = new Folder("public");
		Folder includePath = new Folder("Include Path");
		Folder remoteFiles = new Folder("Remote Files");

		File htaccess = new File(".htaccess");
		File htrouter = new File(".htrouter.php");
		File index = new File("index.html");

		publicFolder.addFile(htaccess);
		publicFolder.addFile(htrouter);
		publicFolder.addFile(index);

		app.addSubfolder(config);
		app.addSubfolder(controllers);
		app.addSubfolder(library);
		app.addSubfolder(migrations);
		app.addSubfolder(models);
		app.addSubfolder(views);

		sourceFiles.addSubfolder(phalcon);
		sourceFiles.addSubfolder(app);
		sourceFiles.addSubfolder(cache);
		sourceFiles.addSubfolder(publicFolder);

		demo1.addSubfolder(sourceFiles);
		demo1.addSubfolder(includePath);
		demo1.addSubfolder(remoteFiles);

		demo1.print();
		sourceFiles.print();
		app.print();
		publicFolder.print();

		System.out.println("---Deleting the app folder---");
		sourceFiles.deleteSubfolder(app);
		demo1.print();
		sourceFiles.print();
		publicFolder.print();

		System.out.println("---Deleting the public folder---");
		sourceFiles.deleteSubfolder(publicFolder);
		demo1.print();
		sourceFiles.print();
	}
}
