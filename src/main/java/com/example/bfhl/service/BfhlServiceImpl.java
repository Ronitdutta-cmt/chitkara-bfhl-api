package com.example.bfhl.service;

import com.example.bfhl.dto.RequestDTO;
import com.example.bfhl.dto.ResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlServiceImpl implements BfhlService {

    @Override
    public ResponseDTO process(RequestDTO request) {

        ResponseDTO response = new ResponseDTO();

        List<String> odd = new ArrayList<>();
        List<String> even = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> special = new ArrayList<>();

        long sum = 0;

        StringBuilder alphaBuilder = new StringBuilder();

        for (String item : request.getData()) {

            if (item.matches("\\d+")) {

                int num = Integer.parseInt(item);

                if (num % 2 == 0)
                    even.add(item);
                else
                    odd.add(item);

                sum += num;
            }

            else if (item.matches("[a-zA-Z]+")) {

                alphabets.add(item.toUpperCase());

                alphaBuilder.append(item);
            }

            else {

                special.add(item);
            }
        }

        String reversed = alphaBuilder.reverse().toString();

        StringBuilder concat = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {

            char ch = Character.toLowerCase(reversed.charAt(i));

            if (i % 2 == 0)
                concat.append(Character.toUpperCase(ch));
            else
                concat.append(ch);
        }

        response.setSuccess(true);
        

        // CHANGE THESE TO YOUR DETAILS
        response.setUser_id("ronit_dutta_24062026");
        response.setEmail("ronit1195.be23@chitkara.edu.in");
        response.setRoll_number("2310991195");

        response.setOdd_numbers(odd);
        response.setEven_numbers(even);
        response.setAlphabets(alphabets);
        response.setSpecial_characters(special);

        response.setSum(String.valueOf(sum));
        response.setConcat_string(concat.toString());

        return response;
    }
}