import groovyjarjarasm.asm.tree.TryCatchBlockNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Generate_String_From_Resource {

    public static String generateStringFromResource(String path) {
        String str = "";
        try {

            str = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
          e.getStackTrace();
        }
        return str;
    }
}
