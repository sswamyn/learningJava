import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;
import java.nio.channels.FileChannel;
import java.nio.file.Path;

/* This example needs
    javac -Xlint:preview --enable-preview --release 21 StreamMemoryLayout.java
    java --enable-preview StreamMemoryLayout
*/
public class StreamMemoryLayout {
    public static void main(String[] args) throws IOException {

        var channel = FileChannel.open(
                Path.of("/Users/swamysivasubramaniyan/home/repo/java/test")); // current directory
        var arena = Arena.ofConfined();

        var segment = channel.map(
                FileChannel.MapMode.READ_ONLY,
                0,
                channel.size(),
                arena);

        var layout = ValueLayout.JAVA_INT;

        var stream = segment.elements(layout);
    }
}