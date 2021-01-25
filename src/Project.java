public class Project {

        public static void main(String[] args) {
            String card = args[0];
            if (isValidByLA(card)) {
            } else {
                System.out.println("INVALID");
            }
        }
        public static boolean isValidByLA(String card) {
            if (card.contains("-")) {
                return false;
            }
            char[] letters = card.toCharArray();
            String tmp = "";
            for (int i = letters.length - 2; i >= 0; i -= 2) {
                tmp += Integer.parseInt(String.valueOf(letters[i])) * 2;
            }
            int sum = 0;
            for (char ch : tmp.toCharArray()) {
                sum += Integer.parseInt(String.valueOf(ch));
            }
            for (int i = letters.length - 1; i >= 0; i -= 2) {
                sum += Integer.parseInt(String.valueOf(letters[i]));
            }
            return sum % 10 == 0;
        }
    }

