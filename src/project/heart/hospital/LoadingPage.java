package project.heart.hospital;

public class LoadingPage {

// bG Color
    final String ANSI_RESET = "\u001B[0m";

    final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    final String ANSI_RED_BACKGROUND = "\u001B[41m";
    final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    final String ANSI__Bright_RED_BACKGROUND = "\u001b[41;1m";
    final String ANSI__Bright_Green_BACKGROUND = "\u001b[42;1m";
    final String ANSI__Bright_Yellow_BACKGROUND = "\u001b[43;1m";
    final String ANSI__Bright_Blue_BACKGROUND = "\u001b[44;1m";

    //end
//Letter Color
    final String Black = "\u001b[30m";
    final String Red = "\u001b[31m";
    final String Green = "\u001b[32m";
    final String Yellow = "\u001b[33m";
    final String Blue = "\u001b[34m";
    final String Magenta = "\u001b[35m";
    final String Cyan = "\u001b[36m";
    final String White = "\u001b[37m";
    final String Reset = "\u001b[0m";
//end

// heart color
    String x = "";
    String y = Yellow;

//hospital color
    String a = "";
    String b = Yellow;

    public void process1() {

        System.out.print("\n\n\n\n\n\n                                        " + Yellow + "LOADING" + Reset + "\n                                        ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET);
            System.out.print(ANSI_YELLOW_BACKGROUND + "  " + ANSI_RESET);
            //System.out.print(ANSI_WHITE_BACKGROUND+" "+ ANSI_RESET);
            //System.out.print(ANSI_GREEN_BACKGROUND+" "+ ANSI_RESET);
            for (int j = 1; j <= 1000000000; j++) {
                for (int k = 1; k <= 1000000000; k++) {
                }
            }
        }
        for (int i = 1; i <= 4; i++) {
            System.out.print(ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET);
            System.out.print(ANSI_YELLOW_BACKGROUND + "  " + ANSI_RESET);
        }
        System.out.println("");
        System.out.print("                                                            ");
    }

    public String letter_H() {
        return "* *       * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* * * * * * *\n"
                + "* * * * * * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* *       * *";
    }

    public String letter_O() {
        return "* * * * * * *\n"
                + "* * * * * * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* * * * * * *\n"
                + "* * * * * * *";
    }

    public String letter_S() {
        return "* * * * * * *\n"
                + "* * * * * * *\n"
                + "* *          \n"
                + "* *          \n"
                + "* * * * * * *\n"
                + "* * * * * * *\n"
                + "          * *\n"
                + "          * *\n"
                + "* *       * *\n"
                + "* * * * * * *\n"
                + "* * * * * * *";
    }

    public String letter_P() {
        return "* * * * * * *\n"
                + "* * * * * * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* * * * * * *\n"
                + "* * * * * * *\n"
                + "* *          \n"
                + "* *          \n"
                + "* *          \n"
                + "* *          \n"
                + "* *          ";
    }

    public String letter_I() {
        return "* * * * * * *\n"
                + "* * * * * * *\n"
                + "    * *      \n"
                + "    * *      \n"
                + "    * *      \n"
                + "    * *      \n"
                + "    * *      \n"
                + "    * *      \n"
                + "    * *      \n"
                + "* * * * * * *\n"
                + "* * * * * * *";
    }

    public String letter_T() {
        return "* * * * * * *\n"
                + "* * * * * * *\n"
                + "    * *      \n"
                + "    * *      \n"
                + "    * *      \n"
                + "    * *      \n"
                + "    * *      \n"
                + "    * *      \n"
                + "    * *      \n"
                + "    * *      \n"
                + "    * *      ";
    }

    public String letter_A() {
        return "* * * * * * *\n"
                + "* * * * * * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* * * * * * *\n"
                + "* * * * * * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* *       * *";
    }

    public String letter_L() {
        return "* *          \n"
                + "* *          \n"
                + "* *          \n"
                + "* *          \n"
                + "* *          \n"
                + "* *          \n"
                + "* *          \n"
                + "* *          \n"
                + "* *          \n"
                + "* * * * * * *\n"
                + "* * * * * * *";
    }

    public String letter_E() {
        return "* * * * * * *\n"
                + "* * * * * * *\n"
                + "* *          \n"
                + "* *          \n"
                + "* * * * * * *\n"
                + "* * * * * * *\n"
                + "* *          \n"
                + "* *          \n"
                + "* *          \n"
                + "* * * * * * *\n"
                + "* * * * * * *";
    }

    public String letter_R() {
        return "* * * * * * *\n"
                + "* * * * * * *\n"
                + "* *       * *\n"
                + "* *       * *\n"
                + "* * * * * * *\n"
                + "* * * * * * *\n"
                + "* * * *      \n"
                + "* *  * *     \n"
                + "* *   * *    \n"
                + "* *    * *   \n"
                + "* *     * *  ";
    }

    public String word_HEART() {
        return y + x + "* *       * *  * * * * * * *  * * * * * * *  * * * * * * *  * * * * * * *\n" + Reset + ANSI_RESET
                + y + x + "* *       * *  * * * * * * *  * * * * * * *  * * * * * * *  * * * * * * *\n" + Reset + ANSI_RESET
                + y + x + "* *       * *  * *            * *       * *  * *       * *      * *      \n" + Reset + ANSI_RESET
                + y + x + "* *       * *  * *            * *       * *  * *       * *      * *      \n" + Reset + ANSI_RESET
                + y + x + "* * * * * * *  * * * * * * *  * * * * * * *  * * * * * * *      * *      \n" + Reset + ANSI_RESET
                + y + x + "* * * * * * *  * * * * * * *  * * * * * * *  * * * * * * *      * *      \n" + Reset + ANSI_RESET
                + y + x + "* *       * *  * *            * *       * *  * * * *            * *      \n" + Reset + ANSI_RESET
                + y + x + "* *       * *  * *            * *       * *  * *  * *           * *      \n" + Reset + ANSI_RESET
                + y + x + "* *       * *  * *            * *       * *  * *   * *          * *      \n" + Reset + ANSI_RESET
                + y + x + "* *       * *  * * * * * * *  * *       * *  * *    * *         * *      \n" + Reset + ANSI_RESET
                + y + x + "* *       * *  * * * * * * *  * *       * *  * *     * *        * *      " + Reset + ANSI_RESET;
    }

    public String word_HOSPITAL() {
        return b + a + "* *       * *  * * * * * * *  * * * * * * *  * * * * * * *  * * * * * * *  * * * * * * *  * * * * * * *  * *          \n" + Reset + ANSI_RESET
                + b + a + "* *       * *  * * * * * * *  * * * * * * *  * * * * * * *  * * * * * * *  * * * * * * *  * * * * * * *  * *          \n" + Reset + ANSI_RESET
                + b + a + "* *       * *  * *       * *  * *            * *       * *       * *            * *       * *       * *  * *          \n" + Reset + ANSI_RESET
                + b + a + "* *       * *  * *       * *  * *            * *       * *       * *            * *       * *       * *  * *          \n" + Reset + ANSI_RESET
                + b + a + "* * * * * * *  * *       * *  * * * * * * *  * * * * * * *       * *            * *       * * * * * * *  * *          \n" + Reset + ANSI_RESET
                + b + a + "* * * * * * *  * *       * *  * * * * * * *  * * * * * * *       * *            * *       * * * * * * *  * *          \n" + Reset + ANSI_RESET
                + b + a + "* *       * *  * *       * *            * *  * *                 * *            * *       * *       * *  * *          \n" + Reset + ANSI_RESET
                + b + a + "* *       * *  * *       * *            * *  * *                 * *            * *       * *       * *  * *          \n" + Reset + ANSI_RESET
                + b + a + "* *       * *  * *       * *  * *       * *  * *                 * *            * *       * *       * *  * *          \n" + Reset + ANSI_RESET
                + b + a + "* *       * *  * * * * * * *  * * * * * * *  * *            * * * * * * *       * *       * *       * *  * * * * * * *\n" + Reset + ANSI_RESET
                + b + a + "* *       * *  * * * * * * *  * * * * * * *  * *            * * * * * * *       * *       * *       * *  * * * * * * *" + Reset + ANSI_RESET;
    }

}
