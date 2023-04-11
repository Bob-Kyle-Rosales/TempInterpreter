import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.antlr.v4.runtime.*;


public class App {
    public static void main(String[] args) throws Exception {
 
        Path path = Paths.get("src/Test.txt");
        String content = String.join("\n", Files.readAllLines(path));
        // System.out.println(content);

        CharStream inputStream = CharStreams.fromString(content);;
        SimpleLexer lexer = new SimpleLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SimpleParser parser = new SimpleParser(tokenStream);
        var chatContext = parser.start();
        var visitor = new BasicSimpleVisitor();

        visitor.visit(chatContext);
    }
}
