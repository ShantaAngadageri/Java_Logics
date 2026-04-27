class Normalize1 {
    public static void main(String[] args) {

        String str = " John   Doe0123 ";

        // Normalize
        str = str.toLowerCase();
        str = str.trim();
        str = str.replaceAll(" +", "_");
        str = str.replaceAll("[^a-z0-9_]", "");

        System.out.println("Normalized: " + str);

        // Validate
        if (str.length() >= 6 &&
            str.length() <= 20 &&
            Character.isLetter(str.charAt(0)) &&
            str.matches(".*\\d.*")) {

            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
    }
}
