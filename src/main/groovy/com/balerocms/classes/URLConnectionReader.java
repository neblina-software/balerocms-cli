/**
 * Balero CMS Project: Proyecto 100% Mexicano de código libre.
 * Página Oficial: http://www.balerocms.com
 *
 * @author Anibal Gomez <anibalgomez@icloud.com>
 * @copyright Copyright (C) 2016 Neblina Software. Derechos reservados.
 * @license Licencia BSD; vea LICENSE.txt
 */

package com.balerocms.classes;

import java.net.*;
import java.io.*;

public class URLConnectionReader {
    public void downloadZipFile(String version) throws IOException {
        File file = new File("./updates");
        if(!file.exists()) {
            file.mkdir();
        }

        URL url = new URL("https://github.com/neblina-software/balerocms-enterprise/archive/" + version +".zip");
        int lenght = getFileSize(url);
        System.out.println("Download Size: " + lenght + " MB");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        InputStream in = connection.getInputStream();
        FileOutputStream out = new FileOutputStream("updates/balerocms-enterprise-"+ version +".zip");
        copy(in, out, 1024);
        out.close();
    }

    public static void copy(InputStream input, OutputStream output, int bufferSize) throws IOException {
        byte[] buf = new byte[bufferSize];
        int n = input.read(buf);
        while (n >= 0) {
            output.write(buf, 0, n);
            n = input.read(buf);
        }
        output.flush();
    }

    private int getFileSize(URL url) {
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("HEAD");
            conn.getInputStream();
            return conn.getContentLength() / 1000000;
        } catch (IOException e) {
            return -1;
        } finally {
            conn.disconnect();
        }
    }

}