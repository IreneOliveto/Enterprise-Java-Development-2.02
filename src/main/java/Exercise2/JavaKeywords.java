package Exercise2;

public class JavaKeywords {

    public boolean hasJavaKeyword(String string) {
        String[] javaKeywords = {
                "abstract",
                "do",
                "if",
                "package",
                "synchronized",
                "boolean",
                "double",
                "implements",
                "private",
                "this",
                "break",
                "else",
                "import",
                "protected",
                "throw",
                "byte",
                "extends",
                "instanceof",
                "public",
                "throws",
                "case",
                "false",
                "int",
                "return",
                "transient",
                "catch",
                "final",
                "interface",
                "short",
                "true",
                "char",
                "finally",
                "long",
                "static",
                "try",
                "class",
                "float",
                "native",
                "strictfp",
                "void",
                "const",
                "for",
                "new",
                "super",
                "volatile",
                "continue",
                "goto",
                "null",
                "switch",
                "while",
                "default",
                "assert"
        };
        String[] splitString = string.split(" ");


        for (int i = 0; i < javaKeywords.length; i++) {
            for (int j = 0; j <splitString.length; j++) {
                if (splitString[j].equals(javaKeywords[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
