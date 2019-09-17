package main;

import java.io.File;

public class HTMLFileFilter extends javax.swing.filechooser.FileFilter {
    @Override
    public boolean accept(File file) {
        return file.isDirectory() ||
                file.getName().toLowerCase().endsWith(".html") ||
                file.getName().toLowerCase().endsWith(".htm");
    }

    public String getDescription() {
        return "HTML and HTM files";
    }
}
