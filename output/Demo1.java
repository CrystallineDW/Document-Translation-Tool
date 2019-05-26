package 输出流;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter
 * 
 * @author acer
 *
 */
public class Demo1 {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.run("d:/abc.txt");
	}

	public   String run(String output) {
		this.a(output);
		return output;
	}
	

	private  void a(String output) {
		
		FileWriter fw = null;
		try {
			//建立流通道
			 fw = new FileWriter(output);
			
			char[] contents = "累阿".toCharArray();
			fw.write(contents);
			//fw.write(contents, 0, 5);
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			//关闭
			if(fw != null) {
				try {
					fw.close();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		}
	}
}
