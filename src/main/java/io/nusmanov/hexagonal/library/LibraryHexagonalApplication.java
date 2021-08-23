package io.nusmanov.hexagonal.library;

import io.nusmanov.hexagonal.library.infrastructure.UserDomainConfig;
import io.nusmanov.hexagonal.library.infrastructure.LibraryHexagonalConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Import({
		LibraryHexagonalConfig.class,
		UserDomainConfig.class
})
public class LibraryHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryHexagonalApplication.class, args);
	}
}
