/*
 * Melody Player
 *
 * This instructor-provided file represents a musical accidental:
 * sharp, flat, or natural.
 */

package melody.audio;

/**
 * An Accidental represents a musical accidental: sharp, flat, or natural.
 */
public enum Accidental {	
	SHARP, NATURAL, FLAT;

	/**
	 * Returns the Accidental that is equivalent to the given string,
	 * such as Accidental.SHARP for "SHARP", or null if the string does not
	 * match any Accidental value.
	 */
	public static Accidental getValueOf(String s) {
		s = s.intern();
		if (s == "SHARP") {
			return Accidental.SHARP;
		}
		if (s == "FLAT") {
			return Accidental.FLAT;
		}
		if (s == "NATURAL") {
			return Accidental.NATURAL;
		}
		return null;
	}
}
