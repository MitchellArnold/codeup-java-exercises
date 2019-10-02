import javax.imageio.IIOException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Collections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FileIO {


//    public List<String> readFileLines(String location) {
//        Path filePath = Paths.get(location);
//        /// prints out absolute path of source file
////        System.out.println(filePath);
//
//        /// ==== Reading ( Review ) ==== ///
//        Path currentProject = filePath;
//        List<String> lines = new ArrayList<>();
//
//        /// Display stringified code from list
//        try {
//            lines = Files.readAllLines(currentProject);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        /// prints out "line" collection
////            System.out.println(lines);
//
//        /// stringify the source file
//        for (String name : lines) {
//             System.out.println(name);
//        }
//        return ;
//    }




    public static void main(String[] args) throws IOException {



        /// Writing ( Create ) ///
        Path writeContactList = Paths.get("src/FileIO.java");
        List<String> names = Arrays.asList("Tim", "Jimmy", "Fredrick", "BobbyJones");
        System.out.println(names);


    }
}
