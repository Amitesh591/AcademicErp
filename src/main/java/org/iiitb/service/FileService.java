package org.iiitb.service;

import java.io.InputStream;

public interface FileService {
    boolean upload(InputStream uploadedInputStream, String fileName);
}
