package cn.xulei.elk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest01 {

	private static final Logger LOGGER = LoggerFactory.getLogger(LogbackTest01.class);

	public static void main(String[] args) {
		LogbackTest01 obj = new LogbackTest01();
//		try {
//			obj.divide();
//		} catch (ArithmeticException ex) {
//			LOGGER.error("大家好111!", ex);
//		}

		for (int i = 0; i < 5; i++) {
			LOGGER.info("第" + i);
		}
	}

//	private void divide() {
//		int i = 10 / 0;
//	}

}
