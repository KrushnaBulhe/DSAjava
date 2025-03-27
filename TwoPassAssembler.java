import java.util.*;

public class TwoPassAssembler {

    // Data structures
    static Map<String, Integer> symbolTable = new HashMap<>();
    static List<IntermediateCode> intermediateCode = new ArrayList<>();
    static Map<String, String> opcodeTable = new HashMap<>();
    static int addressCounter = 0;  // To track the address for instructions

    // Class to represent the intermediate code for an instruction
    static class IntermediateCode {
        String opcode;
        List<String> operands;
        int address;

        IntermediateCode(String opcode, List<String> operands, int address) {
            this.opcode = opcode;
            this.operands = operands;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Address: " + address + ", Opcode: " + opcode + ", Operands: " + operands;
        }
    }

    // Initialize the opcode table
    static {
        opcodeTable.put("MOV", "01");
        opcodeTable.put("ADD", "02");
        opcodeTable.put("SUB", "03");
    }

    // Pass-I: Build symbol table and generate intermediate code
    public static void pass1(List<String> assemblyCode) {
        for (String line : assemblyCode) {
            line = line.trim();

            if (line.equals("END")) {
                break;
            }

            // Check for label
            if (line.endsWith(":")) {
                String label = line.substring(0, line.length() - 1); // Remove the colon
                if (!symbolTable.containsKey(label)) {
                    symbolTable.put(label, addressCounter);
                }
                continue;
            }

            // Parse instruction
            String[] parts = line.split(" ");
            String instruction = parts[0];

            if (opcodeTable.containsKey(instruction)) {
                List<String> operands = Arrays.asList(Arrays.copyOfRange(parts, 1, parts.length));
                
                // Generate intermediate code with address placeholders
                intermediateCode.add(new IntermediateCode(opcodeTable.get(instruction), operands, addressCounter));

                // Increment address counter for the next instruction
                addressCounter++;
            }
        }

        // Output the symbol table and intermediate code
        System.out.println("Pass-I Output (Symbol Table and Intermediate Code):");
        System.out.println("Symbol Table: " + symbolTable);

        // Output the intermediate code in a readable format
        System.out.println("Intermediate Code:");
        for (IntermediateCode code : intermediateCode) {
            System.out.println(code);
        }
    }

    // Pass-II: Generate final machine code
    public static void pass2() {
        List<String> finalCode = new ArrayList<>();

        for (IntermediateCode instr : intermediateCode) {
            String opcode = instr.opcode;
            List<String> operands = new ArrayList<>(instr.operands);

            // Replace labels with actual addresses
            for (int i = 0; i < operands.size(); i++) {
                String operand = operands.get(i);
                if (symbolTable.containsKey(operand)) {
                    operands.set(i, String.valueOf(symbolTable.get(operand)));
                }
            }

            // Generate final machine code and add to the final code list
            finalCode.add(opcode + " " + String.join(" ", operands));
        }

        // Output the final machine code
        System.out.println("\nPass-II Output (Final Machine Code):");
        for (String line : finalCode) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        // Example input (assembly code)
        List<String> assemblyCode = Arrays.asList(
            "START: ORG 100",
            "MOV A, B",
            "ADD A, C",
            "SUB A, D",
            "END"
        );

        // Run Pass-I
        pass1(assemblyCode);

        // Run Pass-II
        pass2();
    }
}

