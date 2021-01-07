package java10;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
/**
 * 编写一个复制任意类型的类程序CopyFile.java，该类就只有一个方法copy，方法声明如下：
 * public boolean copy(String fromFileName, String toFileName, boolean override)
 * fromFileName:源文件名
 * toFileName:目标文件名
 * override:目标文件存在时是否覆盖。
 * return:复制成功返回true，否则返回false
 * @author Administrator
 *
 */
public class copyfile {
	public boolean copy(String fromFileName, String toFileName, boolean override) {
		File fromFile = new File(fromFileName);
		File toFile = new File(toFileName);
		
		/*
		 * 判断源文件是否存在 || 源文件是否是文件 || 源文件是否可读
		 */
		if(!fromFile.exists() || !fromFile.isFile() || !fromFile.canRead()) {
			System.out.println("源文件出错");
			return false;
		}
		/*
		 * 判断目标文件是否为目录，如果是目录则将重新定义目标对象，将源文件复制到该目录下
		 */
		if(toFile.isDirectory()) {
			toFile = new File(toFile, fromFile.getName());
		}
		/*
		 * 判断目标文件是否存在
		 */
		if(toFile.exists()) {
			if(!toFile.canWrite() || override == false) {//目标文件如果存在，判断目标文件是否可写，判断override是否为false
				return false;
			}
		}else {//目标文件如果不存在，获取目标文件的抽象路径名字符串
			String parent = toFile.getParent();
			if(parent == null) {
				parent = System.getProperty("user.dir");//如果parent为null，则获取当前目录路径
			}
			File dir = new File(parent);
			if(!dir.exists() || dir.isFile() || !dir.canWrite()) {//如果该路径不存在 || 该路径名是个文件 || 该路径目录不可写，则返回false
				return false;
			}
		}
		
		/*
		 * 创建输入输出流对象，值为null
		 */
		FileInputStream from = null;
		FileOutputStream to = null;
		/*
		 * 复制文件操作
		 */
		try {
			/*
			 * 输入输出流对象引用指向源文件和目标文件
			 */
			from = new FileInputStream(fromFile);
			to = new FileOutputStream(toFile);
			
			byte[] buffbyte = new byte[10*1024];//定义复制缓冲区
			/*
			 * 复制操作
			 */
			int len = -1;
			while((len = from.read(buffbyte)) != -1) {
				to.write(buffbyte, 0, len);
			}
			return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {//关闭流
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
		System.out.println("程序结束");
	}
}
	
