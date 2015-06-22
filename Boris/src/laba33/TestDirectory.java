package laba33;

//Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.

public class TestDirectory {
    public static void main(String[] args) {
        Directory directory = new Directory("./Boris/Boris.iml");
        System.out.println(directory.seeCatalogues());
        System.out.println(directory.seeFiles());
    }
}
