import java.util.*;

public class PrabhuExpressionEvaluator {

    // Map to convert word-based numbers to digits
    static Map<String, Integer> wordToDigit = new HashMap<>();
    
    static {
        wordToDigit.put("zero", 0);
        wordToDigit.put("one", 1);
        wordToDigit.put("two", 2);
        wordToDigit.put("three", 3);
        wordToDigit.put("four", 4);
        wordToDigit.put("five", 5);
        wordToDigit.put("six", 6);
        wordToDigit.put("seven", 7);
        wordToDigit.put("eight", 8);
        wordToDigit.put("nine", 9);
    }

    // Helper function to convert word-based number to integer
    static int parseNumber(String s) {
        String[] parts = s.split("c");
        StringBuilder num = new StringBuilder();
        for (String part : parts) {
            if (!wordToDigit.containsKey(part)) return -1;  // Invalid word
            num.append(wordToDigit.get(part));
        }
        return Integer.parseInt(num.toString());
    }

    // Function to evaluate a single operation with two operands
    static int evaluateSingleOperation(String operation, int operand1, int operand2) {
        switch (operation) {
            case "add":
                return operand1 + operand2;
            case "sub":
                return operand1 - operand2;
            case "mul":
                return operand1 * operand2;
            case "rem":
                return operand1 % operand2;
            case "pow":
                return (int) Math.pow(operand1, operand2);
            default:
                return Integer.MIN_VALUE; // Invalid operation
        }
    }

    // Function to process input and evaluate the expression
    public static String evaluateExpression(String[] words) {
        List<String> validOperations = Arrays.asList("add", "sub", "mul", "rem", "pow");

        // First, validate all words and convert operands
        List<Integer> operands = new ArrayList<>();
        List<String> operations = new ArrayList<>();
        
        for (String word : words) {
            if (validOperations.contains(word)) {
                operations.add(word); // Store valid operations
            } else {
                int number = parseNumber(word); // Try to parse the word as a number
                if (number == -1) {
                    return "expression evaluation stopped invalid words present"; // Invalid word
                }
                operands.add(number); // Store valid number
            }
        }
        
        // Now, check the validity of the expression based on the operations and operands count
        if (operations.size() == 1 && operands.size() == 2) {
            // Single operation with two operands
            return String.valueOf(evaluateSingleOperation(operations.get(0), operands.get(0), operands.get(1)));
        } else if (operations.size() == 2 && operands.size() == 3) {
            // Two operations with three operands (nested)
            int firstResult = evaluateSingleOperation(operations.get(1), operands.get(1), operands.get(2));
            if (firstResult == Integer.MIN_VALUE) {
                return "expression is not complete or invalid"; // Invalid operation
            }
            return String.valueOf(evaluateSingleOperation(operations.get(0), operands.get(0), firstResult));
        } else if (operations.size() == 2 && operands.size() == 3) {
            // Operations applied sequentially
            int secondResult = evaluateSingleOperation(operations.get(1), operands.get(1), operands.get(2));
            if (secondResult == Integer.MIN_VALUE) {
                return "expression is not complete or invalid"; // Invalid operation
            }
            return String.valueOf(evaluateSingleOperation(operations.get(0), operands.get(0), secondResult));
        } else {
            return "expression is not complete or invalid"; // General invalid expression case
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input as words
        String input = sc.nextLine();
        String[] words = input.split(" ");
        
        // Evaluate the expression
        String result = evaluateExpression(words);
        
        // Output the result
        System.out.println(result);
        
        sc.close();
    }
}
