package net.codecamp.akka.streams.java.kata02;

import akka.stream.IOResult;
import akka.stream.javadsl.Source;

import java.util.concurrent.CompletionStage;

class Kata02FileSource {

    /**
     * Task: Create a akka.stream.javadsl.Source that emits line by line of kata02.txt file.
     * <p/>
     * Tip: The direct relative path to the file usually src/main/resources/kata02.txt when using an IDE.
     * <p/>
     * Tip: http://doc.akka.io/docs/akka/2.4.16/java/stream/stream-cookbook.html#Logging_elements_of_a_stream
     * <p/>
     * Reference: http://doc.akka.io/docs/akka/2.4.16/java/stream/stream-io.html#Streaming_File_IO
     * <p/>
     * Check: The kata is solved when the corresponding unit test is green.
     *
     * @return The source.
     */
    static Source<String, CompletionStage<IOResult>> createSourceOfLinesInFileKata02Txt() {
        return null;
    }

}
