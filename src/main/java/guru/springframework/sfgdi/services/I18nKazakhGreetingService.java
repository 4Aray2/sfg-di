package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("KZ")
@Service("i18nService")
public class I18nKazakhGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Salem Alem - KZ";
    }
}
