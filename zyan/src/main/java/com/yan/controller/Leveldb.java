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
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	try {
		db.put(bytes("访问者一"),bytes(df.format(new Date())));//new Date()为获取当前系统时间
		db.put(bytes("访问者二"),bytes(df.format(new Date())));
		db.put(bytes("访问者三"),bytes(df.format(new Date())));
		db.put(bytes("访问者四"),bytes(df.format(new Date())));
		//取出数据
		DBIterator iterator = db.iterator();
		private  int num=1;//访问人数包括自己
		try {
			num=1;
			for(iterator.seekToFirst(); iterator.hasNext(); iterator.next()) {
			beforeVisit.add(new Guest(asString(iterator.peekNext().getKey()),asString(iterator.peekNext().getValue())));
			num++;
	}
			  
		//将访问者姓名，和日期写入数据库
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
