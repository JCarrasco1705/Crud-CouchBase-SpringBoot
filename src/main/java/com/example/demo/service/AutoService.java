package com.example.demo.service;

import com.example.demo.model.ResponseAutoDto;

public interface AutoService {

    ResponseAutoDto findById(String id);
    ResponseAutoDto save(ResponseAutoDto request);
    void deleteById(String id);
}
