package com.example.journalApp.service;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import com.example.journalApp.entity.User;

import java.util.stream.Stream;

public class UserArgumentsProvider implements ArgumentsProvider {
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        return Stream.of(
//                Arguments.of(User.builder().username("hari").password("hari").build()),
//                Arguments.of(User.builder().username("kishan").password("kishan").build())
        );
    }



}
