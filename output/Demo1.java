package �����;

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
			//������ͨ��
			 fw = new FileWriter(output);
			
			char[] contents = "�۰�".toCharArray();
			fw.write(contents);
			//fw.write(contents, 0, 5);
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			//�ر�
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
