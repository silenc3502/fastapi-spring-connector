package com.example.demo.fastapiGateway.controller.form;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class BookResponseForm {
    private Long id;
    private String name;
    private String publishers;
    private String isbn;

    public BookResponseForm() {
    }

    public BookResponseForm(Long id, String name, String publishers, String isbn) {
        this.id = id;
        this.name = name;
        this.publishers = publishers;
        this.isbn = isbn;
    }
}
