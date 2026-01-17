// Java (JDK 22) feature that provides a foreign memory access API
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.Arena;


public class MemoryAPI {
    public static void main(String[] args) {
       simpleExample();

    }

    public static void simpleExample(){
        // A simple example of wrting to a file mapped to off-heap memory
        // and read them back 

        // 1. We need an Arena to allocate memory segments
        var arena = Arena.global(); // This simplest factory method creates a global arena
        // 2. Allocate a memory segment;
        // for example, allocate a segment to hold 10 integers
        var memorySegment = arena.allocateArray(ValueLayout.JAVA_INT, 10);

        // 3. Write some values into the segment
        for (var offset = 0L; offset < 10L; offset++) {
            memorySegment.setAtIndex(ValueLayout.JAVA_INT, offset, 10);
        }

        // Now it is time to read back the values
        var i = new int[10];
        for (var offset = 0L; offset < 10L; offset++) {
            i[(int) offset] = memorySegment.getAtIndex(ValueLayout.JAVA_INT, offset);
            System.out.println("Value at index " + offset + " : " + i[(int) offset]);
        }

    }
}