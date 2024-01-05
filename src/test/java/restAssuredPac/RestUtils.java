package restAssuredPac;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

	public static String getName() {
		String generateName = RandomStringUtils.randomAlphabetic(1);
		return ("gr" + generateName);
	}
}
