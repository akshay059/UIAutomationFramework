package com.rd.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
	private static Config instance;

	public Properties testConfig = new Properties();

	private Config() {

		FileInputStream in = null;
		try {
			in = new FileInputStream("resources/config.properties");
			testConfig.load(in);
		} catch (FileNotFoundException e) {
			System.out.println("file could not be read.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static Config getInstance() {
		if (null == instance) {
			instance = new Config();
		}
		return instance;
	}

}
