package com.yan.controller;
import org.iq80.leveldb.*;
import org.iq80.leveldb.impl.Iq80DBFactory;
import static org.iq80.leveldb.impl.Iq80DBFactory.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Leveldb {
	public static void main(String[] args) throws IOException{
		
		Options options = new Options();
		options.createIfMissing(true);
		DB db = factory.open(new File("D:/LevelDBTest/test"), options);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
	try {
		db.put(bytes("������һ"),bytes(df.format(new Date())));//new Date()Ϊ��ȡ��ǰϵͳʱ��
		db.put(bytes("�����߶�"),bytes(df.format(new Date())));
		db.put(bytes("��������"),bytes(df.format(new Date())));
		db.put(bytes("��������"),bytes(df.format(new Date())));
		//ȡ������
		DBIterator iterator = db.iterator();
		private  int num=1;//�������������Լ�
		try {
			num=1;
			for(iterator.seekToFirst(); iterator.hasNext(); iterator.next()) {
			beforeVisit.add(new Guest(asString(iterator.peekNext().getKey()),asString(iterator.peekNext().getValue())));
			num++;
	}
			  
		//��������������������д�����ݿ�
			db.put(bytes(guest.getName()), bytes(guest.getTime()));
			return beforeVisit;
		
	}
		try {
		  for(iterator.seekToFirst(); iterator.hasNext(); iterator.next()) {
		    String key = asString(iterator.peekNext().getKey());
		    String valueOut = asString(iterator.peekNext().getValue());
		    System.out.println(key+"   "+valueOut);

		  }
		} finally {
		  // Make sure you close the iterator to avoid resource leaks.
		  iterator.close();
		}
		
	}finally {
		  db.close();
		}
	}
	
}
