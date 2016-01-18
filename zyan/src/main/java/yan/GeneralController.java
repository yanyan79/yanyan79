
package yan;
 
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
@Controller 
public class GeneralController {

	@RequestMapping(value="index.do")  
    public void index_jsp(Model model){  
        model.addAttribute("yan", "���");  
        System.out.println("index.jsp");  
    }  
}


/*
package yan;
 
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.iq80.leveldb.*;
import org.iq80.leveldb.impl.Iq80DBFactory;
import static org.iq80.leveldb.impl.Iq80DBFactory.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.Date;
import java.text.SimpleDateFormat;
  
@Controller 
public class GeneralController {
	
	@RequestMapping(value="index.do")  
    public void index_jsp(Model model)throws IOException{  
		
		
		Options options = new Options();
		options.createIfMissing(true);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		DB db = factory.open(new File("D:/LevelDBTest/test"), options);
	try {
		db.put(bytes("������һ"),bytes(df.format(new Date())));//new Date()Ϊ��ȡ��ǰϵͳʱ��
		db.put(bytes("�����߶�"),bytes(df.format(new Date())));
		db.put(bytes("��������"),bytes(df.format(new Date())));
		db.put(bytes("��������"),bytes(df.format(new Date())));
		//ȡ������
		DBIterator iterator = db.iterator();
		try {
		  for(iterator.seekToFirst(); iterator.hasNext(); iterator.next()) {
		    String key = asString(iterator.peekNext().getKey());
		    String valueOut = asString(iterator.peekNext().getValue());
		    System.out.println(key+"   "+valueOut);

		  }
		} finally {
		  iterator.close();
		}
		
	}finally {
		  db.close();
		}

		
		
		
        model.addAttribute("yan", "���");  
        System.out.println("index.jsp");  
    }  
}
*/