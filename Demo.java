package �ַ�������;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo {

	//ͨ��������������˽��
	public String run(String input) {
		//�����ַ
		this.b(input);
		//���ض�ȡ�����ַ�������
		return input;
		
	}
	//��װ˽�÷���
	private  void b(String input) {
		try {
			Reader in = new FileReader( input );
			BufferedReader 	bf = new BufferedReader(in);

			//�ӻ���������ȡһ�У������ļ�ĩ����null 
			String line = bf.readLine();
			while(line != null) {
				
				System.out.println( line );
				line = bf.readLine();
			}
			bf.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
