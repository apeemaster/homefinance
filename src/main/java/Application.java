import entity.Role;
import entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import service.UserService;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(final UserService userService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                userService.addUser(new User("admin", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8", Role.ROLE_ADMIN));
                userService.addUser(new User("user", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8", Role.ROLE_USER));
            }
        };
    }
}