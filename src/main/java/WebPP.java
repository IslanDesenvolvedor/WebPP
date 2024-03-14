import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WebPP {
    public static void main(String[] args) {
        try {
            // Lê o conteúdo do arquivo teste.wpp
            String filePath = "src/main/teste.wpp";
            String input = new String(Files.readAllBytes(Paths.get(filePath)));

            // Cria o lexer e o parser
            WebPPLexer lexer = new WebPPLexer(CharStreams.fromString(input));
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            WebPPParser parser = new WebPPParser(tokenStream);

            // Obtém a árvore de análise sintática
            WebPPParser.InterfaceDeclarationContext tree = parser.interfaceDeclaration();

            // Cria a instância do transpilador e gera o arquivo HTML
            WebPPTranspiler transpiler = new WebPPTranspiler("src/main/index.html");
            transpiler.visit(tree);
            transpiler.closeWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

