package com.gmail.klewzow;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class FilesReader {
	private File file;

	public FilesReader(File file) {
		super();
		this.file = file;
	}

	public FilesReader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String readFile(File file) {
		StringBuilder sb = new StringBuilder();
		String str = "";
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			for (; (str = br.readLine()) != null;) {
				sb.append(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(File file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "FileReader [file=" + file + "]";
	}

}
