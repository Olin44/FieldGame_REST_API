package pl.project.fieldgame;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.project.fieldgame.entities.LatLng;
import pl.project.fieldgame.entities.Map;
import pl.project.fieldgame.entities.ObjectOnMapDetails;
import pl.project.fieldgame.repositories.MapRepository;
import pl.project.fieldgame.repositories.ObjectOnMapRepository;

import java.util.Arrays;

@SpringBootApplication
public class FieldGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(FieldGameApplication.class, args);
		printBanner();
	}

	private static void printBanner(){
		System.out.println("  ______  _        _      _    _____                         \n" +
				" |  ____|(_)      | |    | |  / ____|                        \n" +
				" | |__    _   ___ | |  __| | | |  __   __ _  _ __ ___    ___ \n" +
				" |  __|  | | / _ \\| | / _` | | | |_ | / _` || '_ ` _ \\  / _ \\\n" +
				" | |     | ||  __/| || (_| | | |__| || (_| || | | | | ||  __/\n" +
				" |_|     |_| \\___||_| \\__,_|  \\_____| \\__,_||_| |_| |_| \\___|\n" +
				"                                                             ");
	}

}
