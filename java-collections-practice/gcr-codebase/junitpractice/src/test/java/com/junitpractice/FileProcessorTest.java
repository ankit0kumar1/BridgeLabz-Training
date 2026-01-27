package com.junitpractice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.junitpractice.FileProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private final FileProcessor processor = new FileProcessor();
    private Path testFile;

    @AfterEach
    void cleanup() throws IOException {
        if (testFile != null && Files.exists(testFile)) {
            Files.delete(testFile);
        }
    }

    // ✅ Test writing and reading content
    @Test
    void testWriteAndReadFile() throws IOException {
        testFile = Files.createTempFile("junit_test_", ".txt");
        String content = "Hello JUnit File Test!";

        processor.writeToFile(testFile.toString(), content);
        String read = processor.readFromFile(testFile.toString());

        assertEquals(content, read);
    }

    // Test file exists after writing
    @Test
    void testFileExistsAfterWrite() throws IOException {
        testFile = Files.createTempFile("junit_test_", ".txt");
        String content = "File should exist";

        processor.writeToFile(testFile.toString(), content);

        assertTrue(Files.exists(testFile));
    }

    // Test IOException when file does not exist
    @Test
    void testReadFileDoesNotExist() {
        String missingFile = "no_such_file_12345.txt";

        assertThrows(IOException.class, () -> processor.readFromFile(missingFile));
    }
}
