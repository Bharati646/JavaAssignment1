package com.citiustech.App;

import java.io.FileNotFoundException;

import com.citiustech.Loader.ComplaintLoader;

public class App {
	public static void main(String[] args) throws FileNotFoundException {
		ComplaintLoader cl=new ComplaintLoader();
		cl.ReadData();
	}
}
