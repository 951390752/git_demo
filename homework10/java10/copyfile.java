package java10;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
/**
 * ��дһ�������������͵������CopyFile.java�������ֻ��һ������copy�������������£�
 * public boolean copy(String fromFileName, String toFileName, boolean override)
 * fromFileName:Դ�ļ���
 * toFileName:Ŀ���ļ���
 * override:Ŀ���ļ�����ʱ�Ƿ񸲸ǡ�
 * return:���Ƴɹ�����true�����򷵻�false
 * @author Administrator
 *
 */
public class copyfile {
	public boolean copy(String fromFileName, String toFileName, boolean override) {
		File fromFile = new File(fromFileName);
		File toFile = new File(toFileName);
		
		/*
		 * �ж�Դ�ļ��Ƿ���� || Դ�ļ��Ƿ����ļ� || Դ�ļ��Ƿ�ɶ�
		 */
		if(!fromFile.exists() || !fromFile.isFile() || !fromFile.canRead()) {
			System.out.println("Դ�ļ�����");
			return false;
		}
		/*
		 * �ж�Ŀ���ļ��Ƿ�ΪĿ¼�������Ŀ¼�����¶���Ŀ����󣬽�Դ�ļ����Ƶ���Ŀ¼��
		 */
		if(toFile.isDirectory()) {
			toFile = new File(toFile, fromFile.getName());
		}
		/*
		 * �ж�Ŀ���ļ��Ƿ����
		 */
		if(toFile.exists()) {
			if(!toFile.canWrite() || override == false) {//Ŀ���ļ�������ڣ��ж�Ŀ���ļ��Ƿ��д���ж�override�Ƿ�Ϊfalse
				return false;
			}
		}else {//Ŀ���ļ���������ڣ���ȡĿ���ļ��ĳ���·�����ַ���
			String parent = toFile.getParent();
			if(parent == null) {
				parent = System.getProperty("user.dir");//���parentΪnull�����ȡ��ǰĿ¼·��
			}
			File dir = new File(parent);
			if(!dir.exists() || dir.isFile() || !dir.canWrite()) {//�����·�������� || ��·�����Ǹ��ļ� || ��·��Ŀ¼����д���򷵻�false
				return false;
			}
		}
		
		/*
		 * �����������������ֵΪnull
		 */
		FileInputStream from = null;
		FileOutputStream to = null;
		/*
		 * �����ļ�����
		 */
		try {
			/*
			 * �����������������ָ��Դ�ļ���Ŀ���ļ�
			 */
			from = new FileInputStream(fromFile);
			to = new FileOutputStream(toFile);
			
			byte[] buffbyte = new byte[10*1024];//���帴�ƻ�����
			/*
			 * ���Ʋ���
			 */
			int len = -1;
			while((len = from.read(buffbyte)) != -1) {
				to.write(buffbyte, 0, len);
			}
			return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {//�ر���
			if(from != null) {
				try {
					from.close();
				}catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
			if(to != null) {
				try {
					to.close();
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		copyfile cpFile = new copyfile();
		cpFile.copy("D:\\input.txt", "D:\\output.txt", true);
		System.out.println("�������");
	}
}
	
