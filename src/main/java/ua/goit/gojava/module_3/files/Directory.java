package ua.goit.gojava.module_3.files;

import java.util.List;

public class Directory {
    private List<File> files;

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void deleteDirectory() {
        for (File singleFile : files)
            System.out.println("файл '" + singleFile + "' удален.");
    }
}
