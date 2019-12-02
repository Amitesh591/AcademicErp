package org.iiitb.service.impl;

import org.iiitb.service.FileService;

import java.io.*;
import java.util.Properties;

public class FileServiceImpl implements FileService {
    
    @Override
    public boolean upload(InputStream uploadedInputStream, String fileName) {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            String uploadPath = properties.getProperty("upload.path");
            
            String uploadedFileLocation = uploadPath + "/" + fileName;
            
            OutputStream out = new FileOutputStream(new File(uploadedFileLocation));
            int read = 0;
            byte[] bytes = new byte[1024];
            
            while ((read = uploadedInputStream.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            out.flush();
            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
