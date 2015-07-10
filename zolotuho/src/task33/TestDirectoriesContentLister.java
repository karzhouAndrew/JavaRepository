package task33;

//Вывести список файлов и каталогов выбранного каталога на дискею
//файлы и каталоги должны быть распечатаны отдельною
public class TestDirectoriesContentLister {

    public static void main(String[] args) {
        String path = "./";
        DirectoriesContentLister directoriesContent = new DirectoriesContentLister();
        directoriesContent.createListDirectories(path);
        System.out.println("Directories");
        directoriesContent.printDirectories();
        System.out.println("Files");
        directoriesContent.createListFiles(path);
        directoriesContent.printFiles();
    }
}
