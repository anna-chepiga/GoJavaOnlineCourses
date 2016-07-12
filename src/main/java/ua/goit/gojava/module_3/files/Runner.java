package ua.goit.gojava.module_3.files;

import ua.goit.gojava.module_3.files.Directory;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Directory directory = new Directory();

        List<File> newFiles = new ArrayList<>();
        newFiles.add(new AudioFile());
        newFiles.add(new MusicFile());
        newFiles.add(new TextFile());

        directory.setFiles(newFiles);

        directory.deleteDirectory();
    }
}
