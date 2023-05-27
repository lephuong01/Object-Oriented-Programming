package oop.hus.lab10.decorator.pseudocode;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceDecorate{
    private int compLevel = 6;

    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    public int getCompLevel() {
        return compLevel;
    }

    public void setCompLevel(int compLevel) {
        this.compLevel = compLevel;
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    private String compress(String stringData) {
        byte[] data = stringData.getBytes();
        try {
            ByteArrayOutputStream bount = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bount, new Deflater(compLevel));
            dos.write(data);
            dos.close();
            bount.close();
            return Base64.getEncoder().encodeToString(bount.toByteArray());
        } catch (IOException e) {
            return null;
        }
    }
    private String decompress(String stringData) {
        byte[] data = Base64.getDecoder().decode(stringData);
        try {
            InputStream in = new ByteArrayInputStream(data);
            InflaterInputStream input = new InflaterInputStream(in);
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            int b;
            while ((b = input.read()) != -1) {
                bout.write(b);
            }
            in.close();
            input.close();
            bout.close();
            return new String(bout.toByteArray());
        } catch (IOException ex) {
            return null;
        }
    }
}
