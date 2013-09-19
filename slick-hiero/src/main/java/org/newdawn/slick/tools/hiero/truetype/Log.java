package org.newdawn.slick.tools.hiero.truetype;

/**
 * Simple placeholder for the original logger
 * <p>
 * @author kevin
 */
public class Log {

	/**
	 * Log an error message
	 * <p>
	 * @param msg The message to log
	 */
	public void error(String msg) {
		//System.err.println(msg);
	}

	/**
	 * Log an debug message
	 * <p>
	 * @param msg The message to log
	 */
	public void debug(String msg) {
		//System.err.println(msg);
	}

	/**
	 * Log an warn message
	 * <p>
	 * @param msg The message to log
	 */
	public void warn(String msg) {
		//System.err.println(msg);
	}

	/**
	 * Log an fatal message
	 * <p>
	 * @param msg The message to log
	 */
	public void fatal(String msg) {
		//System.err.println(msg);
	}

	/**
	 * Log an info message
	 * <p>
	 * @param msg The message to log
	 */
	public void info(String msg) {
		//System.err.println(msg);
	}

	/**
	 * Log an trace message
	 * <p>
	 * @param msg The message to log
	 */
	public void trace(String msg) {
		//System.err.println(msg);
	}

	/**
	 * Check if the debug reporting is enabled
	 * <p>
	 * @return True if debug logging is enabled
	 */
	public boolean isDebugEnabled() {
		return true;
	}

	/**
	 * Check if the trace reporting is enabled
	 * <p>
	 * @return True if trace logging is enabled
	 */
	public boolean isTraceEnabled() {
		return false;
	}

}
