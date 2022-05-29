package guru.springframework.sfgdi.services;

public class I18nKazakhGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Salem Alem - KZ";
    }
}
