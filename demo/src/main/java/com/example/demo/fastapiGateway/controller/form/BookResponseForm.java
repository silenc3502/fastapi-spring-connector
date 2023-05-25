package com.example.demo.fastapiGateway.controller.form;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class BookResponseForm {
    final private Long id;
    final private String name;
    final private String publishers;
    final private String isbn;
}
