package mmy;

import java.util.*;

public class First {
	public List<String> translation(String c) {

		List B = new ArrayList<String>();// 初始化列表B
		String D = "";
		D = c.replace("，", ",");
		D = D.replace("。", ".");
		D = D.replace("！", "!");
		D = D.replace("？", "?");
		D = D.replace("‘", "'");
		D = D.replace("；", ";");

		String[] result = D.split("\\p{Punct}");// 使用正值表达式

		System.out.println("-------------------------------------------------");
		int p = 0;
		for (int i = 0; i < result.length; i++) {

			int y = result[i].length();
			if (i > 0) {
				p = p + y + 1;
			} else {
				p = p = y;
			}

			B.add(result[i] + c.charAt(p));

		}

		System.out.println("------------------遍历集合---------------------------");
		// 遍历集合
		Iterator<String> it = B.iterator();// 创建迭代器
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}

		return B;
	}
}
