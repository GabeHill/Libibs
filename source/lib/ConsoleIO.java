package lib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleIO {

	// PRO TIP: Make sure to create a new BufferedReader in each method
	// where a BufferedReader is required. Do NOT close the reader as that will
	// cause
	// other issues. Also, catch ALL IOExceptions and NumberFormatExceptions.
	// Do not simply mark the method with a "throws" statement

	/**
	 * Generates a prompt that expects the user to enter one of two responses that
	 * will equate to a boolean value. The trueString represents the case
	 * insensitive response that will equate to true. The falseString acts
	 * similarly, but for a false boolean value. Example: Assume this method is
	 * called with a trueString argument of "yes" and a falseString argument of
	 * "no". If the enters "YES", the method returns true. If the user enters "no",
	 * the method returns false. All other inputs are considered invalid, the user
	 * will be informed, and the prompt will repeat.
	 *
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param trueString
	 *            - the case insensitive value that will evaluate to true
	 * @param falseString
	 *            - the case insensitive value that will evaluate to false
	 * @return the boolean value
	 */
	public static boolean promptForBool(String prompt, String trueString, String falseString) {
		BufferedReader eat = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(prompt);
		while (true) {
			try {
				String in = eat.readLine();
				if (in.equalsIgnoreCase(trueString)) {
					return true;
				} else if (in.equalsIgnoreCase(falseString)) {
					return false;
				} else {
					System.out.println("Thats not an option. Try again.");
					continue;
				}

			} catch (IOException | NumberFormatException e) {
				System.out.println("Somehow you managed to break it. Great going.");
				e.printStackTrace();
			}
		}

	}

	/**
	 * Generates a prompt that expects a numeric input representing a byte value.
	 * This method loops until valid input is given.
	 *
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the byte value
	 */
	public static byte promptForByte(String prompt, byte min, byte max) {
		return (byte) promptForDouble(prompt, min, max);

	}

	/**
	 * Generates a prompt that expects a single character input representing a char
	 * value. This method loops until valid input is given.
	 *
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the char value
	 */
	public static char promptForChar(String prompt, char min, char max) {
		BufferedReader eat = new BufferedReader(new InputStreamReader(System.in));
		char v = ' ';
		System.out.println(prompt);
		try {
			while (true) {
				String in = eat.readLine();
				v = in.charAt(0);
				if (v >= min) {
					return v;
				} else if (v <= max) {
					return v;
				} else {
					System.out.println("Thats not an option. Try again.");
					continue;
				}
			}
		} catch (IOException | IndexOutOfBoundsException e) {
			System.out.println("Somehow you managed to break it. Great going.");
			e.printStackTrace();
		}

		return v;

	}

	/**
	 * Generates a prompt that expects a numeric input representing a double value.
	 * This method loops until valid input is given.
	 *
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the double value
	 */
	public static double promptForDouble(String prompt, double min, double max) {
		BufferedReader eat = new BufferedReader(new InputStreamReader(System.in));
		double in = 0;
		System.out.println(prompt);
		try {
			while (true) {
				in = Double.parseDouble(eat.readLine());
				if (in >= min) {
					return in;
				} else if (in <= max) {
					return in;
				} else {
					System.out.println("Thats not an option. Try again.");
					continue;
				}
			}
		} catch (IOException | NumberFormatException e) {
			System.out.println("Somehow you managed to break it. Great going.");
			e.printStackTrace();
		}

		return in;

	}

	/**
	 * Generates a prompt that expects a numeric input representing a float value.
	 * This method loops until valid input is given.
	 *
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the float value
	 */
	public static float promptForFloat(String prompt, float min, float max) {

		return (float) promptForDouble(prompt, min, max);

	}

	/**
	 * Generates a prompt that allows the user to enter any response and returns the
	 * String. When allowEmpty is true, empty responses are valid. When false,
	 * responses must contain at least one character (including whitespace).
	 *
	 * @param prompt
	 *            - the prompt to be displayed to the user.
	 * @param allowEmpty
	 *            - when true, makes empty responses valid
	 * @return the input from the user as a String
	 */
	public static String promptForInput(String prompt, boolean allowEmpty) {

		BufferedReader eat = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(prompt);
		String kek;
		try {
			while (true) {
				kek = eat.readLine();
				if (kek != null) {
					if (kek.equalsIgnoreCase("") && !allowEmpty) {
						System.out.println("Yo you wrong there dude. Try it all again.");

					} else {
						return kek;
					}
				}
			}
		} catch (IOException e) {
			System.out.println("Somehow you managed to break it. Great going.");
			e.printStackTrace();
		}

		return null;

	}

	/**
	 * Generates a prompt that expects a numeric input representing an int value.
	 * This method loops until valid input is given.
	 *
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the int value
	 */
	public static int promptForInt(String prompt, int min, int max) {
		return (int) promptForDouble(prompt, min, max);

	}

	/**
	 * Generates a prompt that expects a numeric input representing a long value.
	 * This method loops until valid input is given.
	 *
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the long value
	 */
	public static long promptForLong(String prompt, long min, long max) {
		return (long) promptForDouble(prompt, min, max);

	}

	/**
	 * Generates a console-based menu using the Strings in options as the menu
	 * items. Reserves the number 0 for the "quit" option when withQuit is true.
	 *
	 * @param options
	 *            - Strings representing the menu options
	 * @param withQuit
	 *            - adds option 0 for "quit" when true
	 * @return the int of the selection made by the user
	 */
	public static int promptForMenuSelection(String[] options, boolean withQuit) {
		BufferedReader eat = new BufferedReader(new InputStreamReader(System.in));
		String out = "";
		int in = 0;
		;
		if (withQuit) {
			out += "0) Exit\n";
		}
		int i = 0;
		for (String s : options) {
			i++;
			out += i + ") " + s + "\n";
		}
		System.out.println(out + "\nEnter the number for your selection:");
		try {
			while (true) {
				in = Integer.parseInt(eat.readLine());
				if (withQuit && (in <= options.length)) {
					return in;
				} else if ((i <= options.length) && (i > 0)) {
					return in;
				} else {
					System.out.println("Thats not an option. Try again.");
					continue;
				}
			}
		} catch (IOException | NumberFormatException e) {
			System.out.println("Somehow you managed to break it. Great going.");
			e.printStackTrace();
		}

		return in;

	}

	/**
	 * Generates a prompt that expects a numeric input representing a short value.
	 * This method loops until valid input is given.
	 *
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the short value
	 */
	public static short promptForShort(String prompt, short min, short max) {
		return (short) promptForDouble(prompt, min, max);
	}

}
