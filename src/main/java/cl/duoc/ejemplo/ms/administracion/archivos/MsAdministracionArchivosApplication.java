package cl.duoc.ejemplo.ms.administracion.archivos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsAdministracionArchivosApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsAdministracionArchivosApplication.class, args);
    }

    @Bean
    CommandLineRunner test() {
        return args -> {
            System.out.println("ACCESS_KEY = " + System.getenv("AWS_ACCESS_KEY_ID"));
            System.out.println("REGION = " + System.getenv("AWS_REGION"));
        };
    }
}