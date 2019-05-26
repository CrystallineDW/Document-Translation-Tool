package 字符缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo {

	//通过公共方法调用私有
	public String run(String input) {
		//输入地址
		this.b(input);
		//返回读取到的字符串内容
		return input;
		
	}
	//封装私用方法
	private  void b(String input) {
		try {
			Reader in = new FileReader( input );
			BufferedReader 	bf = new BufferedReader(in);

			//从缓冲字流读取一行，读到文件末返回null 
			String line = bf.readLine();
			while(line != null) {
				
				System.out.println( line );
				line = bf.readLine();
			}
			bf.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
