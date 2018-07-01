package in.co.examsadda.util;

import java.math.BigInteger;

public class NumberConverter {
	
	public static BigInteger getBigInt(int number) {
		return new BigInteger(String.valueOf(number));
	}

}
