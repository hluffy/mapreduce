package com.dk.mapreduce;

import org.apache.hadoop.conf.Configuration;


public class ReadConfig {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.addResource("configuration-1.xml");
		conf.addResource("configuration-2.xml");
		System.out.println(conf.get("color"));
		System.out.println(conf.get("size"));
		System.out.println(conf.get("weight"));
		System.out.println(conf.get("size-weight"));
	}

}
