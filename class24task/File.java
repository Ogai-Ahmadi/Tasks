package class24task;

public abstract class File {
    //Create a class File that will have the following behaviors:
    // open, edit, close. Edit and close are implemented method while open is an abstract.
    // Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation
    // of open behaviour: Example: to open .java file we need notepad++ or sublime text,
    // to open .doc file we need Microsoft word to be installed etc
   public abstract void open();


    public void edit(){
        System.out.println("File has been edited");
    }
    public void close(){
        System.out.println("File has been closed");
    }
}
class JavaFile extends File{
   public void open() {
        System.out.println("To open .Java file, we need notepad++ or sublime text");
    }
}
class WordFile extends File{
    public void open() {
        System.out.println("To open .doc file, we need Microsoft Word to be installed.");
    }
}
class PdfFile extends File{
    public void open() {
        System.out.println("To open .pdf file, we need Adob to be installed.");
    }
}
class TestFile{
    public static void main(String[] args){
        File[] files ={new JavaFile(), new PdfFile(), new WordFile()};
        for(File f:files){
            f.open();
            f.close();
            f.edit();

        }

    }
}
