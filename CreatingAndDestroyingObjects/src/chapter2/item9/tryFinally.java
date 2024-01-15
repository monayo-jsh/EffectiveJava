package chapter2.item9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class tryFinally {

    public static void main(String[] args) throws IOException {

        String firstLine = firstLineOfFile("path");

    }

    // 회수해야하는 자원을 다룰때는 try-finally 말고 try-with-resources 를 사용
    // 사용하기 위해서는 AutoCloseable 구현 필요
    private static String firstLineOfFile(String path) {

        try ( BufferedReader br = new BufferedReader(new FileReader(path)) ) {
            return br.readLine();
        } catch ( IOException e ) {
            return "defaultValue";
        }
    }

    private static void copy(String src, String dst) throws IOException {

        try (
            InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst)
        ) {
           byte[] buf = new byte[10];
           int n;
           while ((n = in.read(buf)) >= 0) {
               out.write(buf, 0, n);
           }
        }
    }
}
