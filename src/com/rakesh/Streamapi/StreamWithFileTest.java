package com.rakesh.Streamapi;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamWithFileTest {

	public static void main(String[] args) {


		Path path=Paths.get("fancy.txt");
		try (Stream<String> lines=Files.lines(path)){
			lines.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
