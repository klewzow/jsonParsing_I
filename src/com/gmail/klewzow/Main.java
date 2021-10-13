package com.gmail.klewzow;

import java.io.File;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		File file = new File("./json.txt");

		String s = new FilesReader().readFile(file);

		JsonRoot jr = (JsonRoot) new GsonBuilder().create().fromJson(s, JsonRoot.class);
		StringBuilder sb = new StringBuilder();
		sb.append("Name : " + jr.name + "Surname : " + jr.surname + "\n" + "tel : ");

		for (String tel : jr.phones) {
			sb.append(tel + ", ");
		}
		sb.append("\n");
		for (String st : jr.sites) {
			sb.append("sites : " + st + ",  ");

		}
		sb.append("\n" + jr.address.toString());
		System.out.println(sb.toString());
	}

}
