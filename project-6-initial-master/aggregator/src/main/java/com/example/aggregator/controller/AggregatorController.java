package com.example.aggregator.controller;

import com.example.aggregator.client.AggregatorRestClient;
import com.example.aggregator.model.Entry;
import com.example.aggregator.service.AggregatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AggregatorController {

    private static final Logger logger = LoggerFactory.getLogger(AggregatorController.class.getName());
    private AggregatorService service;

    public AggregatorController(AggregatorService service) {
        this.service = service;
    }

    @GetMapping("/getDefinitionFor/{word}")
    public Entry getDefinitionFor(@PathVariable String word) {
        return service.getDefinitionFor(word);
    }

    @GetMapping("/getWordsThatContainSuccessiveLettersAndStartsWith/{chars}")
    public List<Entry> getWordsThatContainSuccessiveLettersAndStartsWith(@PathVariable String chars) {
        return service.getWordsThatContainSuccessiveLettersAndStartsWith(chars);
    }

    @GetMapping("/getAllPalindromes/{word}")
    public List<int> getAllPalindromes() {

        static List<int> candidates = new ArrayList<>();

        for(int i=1;i<=size;i++)
        {
            List<Entry> startsWith = restClient.getWordsStartingWith(c);
            List<Entry> endsWith = restClient.getWordsEndingWith(c);
            List<Entry> start&EndsWith = new ArrayList<>(startsWith);
            starts&EndsWith.retainAll(endsWith);
            candidates.addAll(starts&EndsWith);
        });
        return candidates.stream()
        void reverse(int n)
        {
            int reverse= 0;

            while (n!=0) {

                int reverse = reverse * 10 + n % 10;

                n = n/10;}

            return reverse;

        }
    }
}

