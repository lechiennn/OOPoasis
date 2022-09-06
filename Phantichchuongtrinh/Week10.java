import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Week10 {

    private static final ArrayList<String> defaultTypes = new ArrayList<>(Arrays.asList(
            "boolean", "char", "int", "float",
            "double", "long", "short", "bytes", "T[]"));

    private static boolean canScan = true;
    private static HashMap<String, String> libs;

    /**
     * return list function.
     *
     * @param fileContent .
     * @return .
     */
    public static List<String> getAllFunctions(String fileContent) {

        libs = getImports(fileContent);
        libs.put("QueryAPI", "com.nordstrom.common.jdbc.utils.QueryAPI");
        libs.put("SProcAPI", "com.nordstrom.common.jdbc.utils.SProcAPI");
        libs.put("Param", "com.nordstrom.common.jdbc.Param");

        ArrayList<String> functions = getStatic(fileContent);
        for (int i = 0; i < functions.size(); i++) {
            functions.set(i, format(functions.get(i)));
        }
        return functions;
    }

    /**
     * can scan.
     *
     * @param scanner .
     * @return .
     */
    private static String scan(Scanner scanner) {
        String input = scanner.next();
        switch (input) {
            case "//":
                scanner.nextLine();
                canScan = true;
                return null;

            case "/*":
                canScan = false;
                return null;

            case "/**":
                canScan = false;
                return null;

            case "*/":
                canScan = true;
                return null;
            case "**/":
                canScan = true;
                return null;
            default:
        }
        if (canScan) {
            return input;
        } else {
            return null;
        }
    }

    /**
     * get libs.
     *
     * @param fileContent .
     * @return .
     */
    private static HashMap<String, String> getImports(String fileContent) {
        Scanner scanner = new Scanner(fileContent);
        HashMap<String, String> libs = new HashMap<>();
        while (scanner.hasNext()) {
            String input = scan(scanner);
            if (input == null) {
                continue;
            }
            if (input.equals("import")) {
                if (scanner.hasNext()) {
                    String libName = scanner.next();
                    if (libName.equals("static")) {
                        continue;
                    }
                    if (libName.contains(";")) {
                        libName = libName.substring(0, libName.indexOf(";"));
                    }
                    String[] libNameSplit = libName.split("\\.");
                    libs.put(libNameSplit[libNameSplit.length - 1], libName);
                }
            }
        }
        return libs;
    }

    /**
     * get function name.
     *
     * @param fileContent .
     * @return .
     */
    private static ArrayList<String> getStatic(String fileContent) {
        Scanner scanner = new Scanner(fileContent);
        ArrayList<String> functions = new ArrayList<>();
        while (scanner.hasNext()) {
            String input = scan(scanner);
            if (input == null) {
                continue;
            }
            if (input.equals("static")) {
                String function = "";
                while (scanner.hasNext()) {
                    String check = scanner.next();
                    if (!(check.equals("class") || check.equals("final"))) {
                        function += check + " ";
                        if (function.contains(";")) {
                            break;
                        }
                        if (function.contains("{")) {
                            String output = function.replace("{", "").trim();

                            if (!output.equals("")) {
                                String[] param = output.split(" ", 2);
                                if (param[0].contains("<")) {
                                    functions.add(output.substring(output.indexOf(">") + 1).trim());
                                } else {
                                    functions.add(param[1]);
                                }
                            }
                            break;
                        }

                    } else {
                        break;
                    }
                }
            }
        }
        return functions;
    }

    /**
     * format function name.
     *
     * @param s .
     * @return .
     */
    private static String format(String s) {
        String functionName = s.substring(0, s.indexOf("("));
        String[] functionParams = s.substring(s.indexOf("(") + 1, s.indexOf(")")).split(",");
        ArrayList<String> params = new ArrayList<>();
        for (String value : functionParams) {
            String[] param = value.trim().split(" ");
            params.add(param[0].replace("...", ""));
        }
        for (int i = 0; i < params.size(); i++) {
            params.set(i, convertParams(params.get(i)));
        }
        return functionName + "(" + String.join(",", params) + ")";
    }

    /**
     * format param.
     *
     * @param typeName .
     * @return t.
     */
    private static String convertParams(String typeName) {
        if (typeName.contains("<")) {
            String dataType = typeName.substring(0, typeName.indexOf("<"));
            String[] dataStructureParams = typeName.substring(typeName.indexOf("<") + 1,
                    typeName.indexOf(">")).split(",");

            ArrayList<String> params = new ArrayList<>();
            for (String s : dataStructureParams) {
                String[] param = s.trim().split(" ");
                params.add(param[0].replace("...", ""));
            }
            for (int i = 0; i < params.size(); i++) {
                params.set(i, convertTypeName(params.get(i)));
            }
            return convertTypeName(dataType) + "<"
                    + String.join(",", params) + ">";
        } else {
            return convertTypeName(typeName);
        }
    }

    /**
     * format param name.
     *
     * @param typeName .
     * @return .
     */
    private static String convertTypeName(String typeName) {
        if (defaultTypes.contains(typeName)) {
            return typeName;
        } else if (typeName.length() <= 1) {
            return typeName;
        } else if (libs.containsKey(typeName)) {
            return libs.get(typeName);
        }
        return "java.lang." + typeName;
    }

    /**
     * main.
     *
     * @param args .
     * @throws FileNotFoundException .
     */
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\VNU\\Program\\OOP\\week1\\src\\Phantichchuongtrinh\\Test.java";
        FileInputStream fileInputStream = new FileInputStream(url);
        String input = "";
        Scanner sc = new Scanner(fileInputStream);
        while (sc.hasNextLine()) {
            String here = sc.nextLine() + "\n";
            input += here;
        }
        List<String> outPut = getAllFunctions(input);
        for (String s : outPut) {
            System.out.println(s);
        }
    }
}