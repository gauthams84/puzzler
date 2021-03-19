package interviewPrep;

/**
 * Take the following IPv4 address: 128.32.10.1
 * 
 * This address has 4 octets where each octet is a single byte (or 8 bits).
 * 
 * 1st octet 128 has the binary representation: 10000000 2nd octet 32 has the
 * binary representation: 00100000 3rd octet 10 has the binary representation:
 * 00001010 4th octet 1 has the binary representation: 00000001 So 128.32.10.1
 * == 10000000.00100000.00001010.00000001
 * 
 * Because the above IP address has 32 bits, we can represent it as the unsigned
 * 32 bit number: 2149583361
 * 
 * Complete the function that takes an unsigned 32 bit number and returns a
 * string representation of its IPv4 address. 2149583361 ==> "128.32.10.1" 32
 * ==> "0.0.0.32" 0 ==> "0.0.0.0"
 * 
 * @author KAUSHAL PC
 *
 */

public class IPtoBinary {
	public static String longToIP(long ip) {
		String result = "0.0.0.0";

		// Java doesn't have uint32, so here we use long to represent int32
		if (ip != 0) {
			String binary = Long.toBinaryString(ip);
			System.out.println(binary);
			binary = binary.length() < 32 ? "0".repeat(32 - binary.length()) + binary
					: binary.substring(binary.length() - 32, binary.length());
			System.out.println(binary);
			result = String.format("%s.%s.%s.%s", Long.parseLong(binary.substring(0, 8), 2),
					Long.parseLong(binary.substring(8, 16), 2), Long.parseLong(binary.substring(16, 24), 2),
					Long.parseLong(binary.substring(24), 2));
		}
		//System.out.println(result);
		return result; // do it!
	}
}
