package comp_decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class compressor {
    public  static void method(File file)throws IOException{
        String fileDirectory=file.getParent();
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(fileDirectory+"/compressedFile.gz");
        GZIPOutputStream gzip = new GZIPOutputStream(fos);

        byte[] buffer = new byte[1024];
        int len;
        while((len=fis.read(buffer))!=-1){
            gzip.write(buffer,0,len);
            // buffer=the data, 0= offset value the start of offset in the data start from 0, number of bytes to write
        }
        gzip.close();
        fos.close();
        fis.close();

    }
    public static void main(String[] args) throws IOException {
        File path = new File("D:\\1.AccioJob\\Project\\minor projects\\Compressor decompressor - DSA\\COMPRESSOR_DECOMPRESSOR\\CompressedFile.gz");

        method(path);
    }
}
