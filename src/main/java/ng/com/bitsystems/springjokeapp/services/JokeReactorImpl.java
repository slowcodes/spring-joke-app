package ng.com.bitsystems.springjokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeReactorImpl implements JokeReactor {

    private final ChuckNorrisQuotes chuckNorrisQuotes;
    public JokeReactorImpl (ChuckNorrisQuotes chuckNorrisQuotes){
        this.chuckNorrisQuotes =  chuckNorrisQuotes;
    }

    @Override
    public String returnJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}