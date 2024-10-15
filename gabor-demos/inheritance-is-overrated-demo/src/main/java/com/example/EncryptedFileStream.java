package com.example;

// we are DRY (Don't Repeat Yourself) becase we are reusing the code from FileStream
public class EncryptedFileStream extends FileStream {

    private final Encryptor encryptor;

    public EncryptedFileStream(Encryptor encryptor) {
        this.encryptor = encryptor;
    }

    // we also reusing the open and close methods from FileStream, unchanged

    @Override
    public byte[] read() {
        // this is important : calling super.read() so reusing the code from FileStream
        byte[] data = super.read();
        // this is only one line of code which are copy and pasted now across the 3
        // MyStream implementations
        byte[] decryptedData = encryptor.decrypt(data);
        return decryptedData;
    }

    @Override
    public void write(byte[] data) {
        // pre processing
        // this is only one line of code which are copy and pasted now across the 3
        // MyStream implementations
        byte[] encryptedData = encryptor.encrypt(data);
        super.write(encryptedData);
    }

}
