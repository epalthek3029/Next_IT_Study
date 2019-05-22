import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01File {

	public static void main(String[] args) throws IOException {
		
		/*
//		File file = new File("/home/pc26/IO/sample.txt");
		File file = new File("..", "sample.txt");
		
		System.out.println("getName() : " + file.getName());
		System.out.println("getPath() : " + file.getPath());
		System.out.println("getAbsolutePath() : " + file.getAbsolutePath());
		System.out.println("getCanonicalPath() : " + file.getCanonicalPath());
		System.out.println("getParent() : " + file.getParent());
		*/
		
		// 시스템의 루트 디렉토리
		File[] roots = File.listRoots();
//		System.out.println(roots[0]);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 (E) HH:mm:ss");
		
		for(int i = 0; i < roots.length; i++){
			File root = roots[i];
			
			File[] files = root.listFiles();
			// 수정일자, 크기, 유형, 파일명
			// foreach, Advanced For 문
			for(File file:files){
				
				System.out.printf("%s %s %s %s\n", 
								dateFormat.format(new Date(file.lastModified())),
								file.isDirectory()?"<DIR>": "    ",
								(file.length() / 1024) + "KB",
								file.getName()
								);
				
				
			}
		}
		
		
		
		
		
		
		
		
	}
}
