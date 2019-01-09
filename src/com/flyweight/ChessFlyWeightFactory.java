package com.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * ��Ԫ������
 * @author Administrator
 *
 */
public class ChessFlyWeightFactory {
	//��Ԫ��
	private static Map<String, ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();
	public static ChessFlyWeight getChess(String color) {
		if (null != map.get(color)) {
			return map.get(color);
		} else {
			ChessFlyWeight cfw = new ConcreteChess(color);
			map.put(color, cfw);
			return cfw;
		}
	}
}
