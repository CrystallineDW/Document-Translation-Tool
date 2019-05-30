package mmy;
import java.util.*;
public class First {
	public List<String> translation(String c) {

		List B = new ArrayList<String>();// 初始化列表B
		String D = "";
		
		// 将中文替换成英文
		D = c.replace("，", ",");
		D = D.replace("。", ".");
		D = D.replace("！", "!");
		D = D.replace("？", "?");
		D = D.replace("‘", "'");
		D = D.replace("；", ";");
	

		String[] result = D.split("\\p{Punct}");// 使用正值表达式/将字符串按符号分割成字符串组

		
		int p = 0;
		for (int i = 0; i < result.length; i++) {

			int y = result[i].length();// 每字符串组的长度
			 //第一个字符串组不需要忽略符号，所以不用+1
			 
			if (i > 0) {
				p = p + y + 1;
			} else {
				p = p = y;// 第一个不用+1
			}
		
			// charAT()是指定字符串索引位置 / 将 第i个字符串与其后面的符号合并添加在集合中
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
